@echo off
setlocal enabledelayedexpansion

REM Thiet lap bo dem
set counter=0

REM Goi script VBS de thu thap duong dan file va thu muc dau ra
for /f "delims=" %%a in ('cscript //nologo Menu.vbs') do (
    set /a counter+=1
    if !counter! equ 1 (
        set "sourceFile=%%a"
    ) else if !counter! equ 2 (
        set "nameListFile=%%a"
    ) else if !counter! equ 3 (
        set "outputDir=%%a"
    )
)

REM Xuat duong dan de chan doan
echo File nguon: %sourceFile%
echo File danh sach ten: %nameListFile%
echo Thu muc dau ra: %outputDir%

REM Kiem tra neu cac file va thu muc khong duoc chon
if not defined sourceFile (
    echo Khong co file nguon duoc chon. Dang thoat.
    exit /b
)
if not defined nameListFile (
    echo Khong co file danh sach ten duoc chon. Dang thoat.
    exit /b
)
if not defined outputDir (
    echo Khong co thu muc dau ra duoc chon. Dang thoat.
    exit /b
)

REM Kiem tra neu file nguon khong phai la file hop le
if not exist "%sourceFile%" (
    echo File nguon khong ton tai hoac la mot thu muc. Dang thoat.
    exit /b
)

REM Kiem tra neu file danh sach ten co phai la file .xlsx
if /i "%nameListFile:~-5%" neq ".xlsx" (
    echo File danh sach ten phai la file .xlsx. Dang thoat.
    exit /b
)

REM Lay tat ca ten file tu file exel vao su dung power shell script
setlocal
set i=0
for /f "delims=" %%n in ('powershell -ExecutionPolicy Bypass -File ReadAllNames.ps1 "%nameListFile%"') do (
    set /a i+=1
    set "name[!i!]=%%n"
)

set totalRows=%i%

REM Vong lap qua cac hang da duoc doc trong bo nho
for /l %%i in (1,1,%totalRows%) do (
    set "name=!name[%%i]!"

    REM Thoat vong lap neu ten tra ve la trang (cuoi file)
    if "!name!"=="" (
        echo Khong con du lieu. Dang thoat vong lap.
        goto :endloop
    )

    REM Lay phan mo rong file goc
    for %%f in ("%sourceFile%") do set "ext=%%~xf"

    REM Sao chep file nguon vao thu muc dau ra voi phan mo rong goc
    set "newFileName=!name!!ext!"
    echo Ten file moi: !newFileName!
    echo Sao chep tu: "%sourceFile%" den "%outputDir%\!newFileName!"
    copy "%sourceFile%" "%outputDir%\!newFileName!"

    REM Kiem tra xem viec sao chep co thanh cong khong
    if errorlevel 1 (
        echo Sao chep "%sourceFile%" den "%outputDir%\!newFileName!" that bai
    )
)

:endloop
echo Ket thuc vong lap.
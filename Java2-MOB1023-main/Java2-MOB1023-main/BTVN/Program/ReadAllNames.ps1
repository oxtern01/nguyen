param (
    [string]$nameListFile  # Duong dan den file NameList.xlsx
)

# Dam bao Excel interop duoc su dung
$excel = New-Object -ComObject Excel.Application
$excel.Visible = $false
$excel.DisplayAlerts = $false

# Mo file Excel
$workbook = $excel.Workbooks.Open($nameListFile)
$worksheet = $workbook.Sheets.Item(1)

# Khoi tao bien
$row = 2
$allNames = @()

# Vong lap qua tung dong cho den khi gap o trong o cot 1
while ($worksheet.Cells.Item($row, 1).Text -ne "") {
    $concatenatedName = ""
    $column = 1

    # Vong lap qua cac cot trong dong hien tai, va ghep cac gia tri khong trong lai voi nhau bang dau gach duoi
    while ($worksheet.Cells.Item($row, $column).Text -ne "") {
        if ($concatenatedName -eq "") {
            $concatenatedName = $worksheet.Cells.Item($row, $column).Text
        } else {
            $concatenatedName += "_" + $worksheet.Cells.Item($row, $column).Text
        }
        $column++
    }

    # Luu ten da duoc ghep lai
    $allNames += $concatenatedName

    # Chuyen den dong tiep theo
    $row++
}

# Dong cac doi tuong Excel
$workbook.Close($false)
$excel.Quit()

# Xuat tat ca cac ten, moi ten tren mot dong
$allNames -join "`n"

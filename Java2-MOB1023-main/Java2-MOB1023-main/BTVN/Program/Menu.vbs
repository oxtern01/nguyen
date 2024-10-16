Dim shell, sourceFile, nameListFile, outputFolder

Set shell = CreateObject("Shell.Application")

' Chuc nang de cho nguoi dung chon mot file
Function BrowseForFile(prompt)
    Dim fileDialog
    Set fileDialog = shell.BrowseForFolder(0, prompt, &H4000, 0) ' Su dung &H4000 de chon file
    If Not fileDialog Is Nothing Then
        BrowseForFile = fileDialog.Self.Path
    Else
        BrowseForFile = ""
    End If
End Function

' Chuc nang de cho nguoi dung chon mot thu muc
Function BrowseForFolder(prompt)
    Dim folderDialog
    Set folderDialog = shell.BrowseForFolder(0, prompt, 0, 0)
    If Not folderDialog Is Nothing Then
        BrowseForFolder = folderDialog.Self.Path
    Else
        BrowseForFolder = ""
    End If
End Function

' Cho nguoi dung chon file nguon
sourceFile = BrowseForFile("Select the Source Excel File")
If sourceFile = "" Then
    WScript.Echo "Khong co file nguon duoc chon. Dang thoat."
    WScript.Quit
End If

' Cho nguoi dung chon file danh sach ten
nameListFile = BrowseForFile("Select the Name List Excel File")
If nameListFile = "" Then
    WScript.Echo "Khong co file danh sach ten duoc chon. Dang thoat."
    WScript.Quit
End If

' Cho nguoi dung chon thu muc dau ra
outputFolder = BrowseForFolder("Select the Output Folder")
If outputFolder = "" Then
    WScript.Echo "Khong co thu muc dau ra duoc chon. Dang thoat."
    WScript.Quit
End If

' Xuat cac duong dan da chon (duoc su dung boi batch script)
WScript.Echo sourceFile
WScript.Echo nameListFile
WScript.Echo outputFolder
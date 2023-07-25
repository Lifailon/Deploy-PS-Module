$Name_Module = "pSyslog"
$GitHub_Rep = "https://api.github.com/repos/Lifailon/pSyslog/tarball"
$Temp_Path = "$env:TEMP\$Name_Module.tar.gz"
Invoke-WebRequest -URI $GitHub_Rep -outfile $Temp_Path # download
Set-Location $env:TEMP
tar -xzf $Temp_Path # extract gzip
$Path_Arch = (Get-ChildItem *$Name_Module* -Directory).FullName
$Module_Path = "C:\Program Files\PowerShell\Modules"
Remove-Item "$Module_Path\$Name_Module" -Recurse -Force
Copy-Item -Path "$Path_Arch\Module\pSyslog" -Destination "$Module_Path\" -Recurse
Remove-Item $Temp_Path
Remove-Item $Path_Arch -Recurse
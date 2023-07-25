$Module_Path = "C:\Program Files\PowerShell\7\Modules"
$Name_Module = "pSyslog"
$Temp_Path = "$env:TEMP\$Name_Module.tar.gz"
$GitHub_Rep = "https://api.github.com/repos/Lifailon/pSyslog/tarball"

Invoke-WebRequest -URI $GitHub_Rep -outfile $Temp_Path # download
Set-Location $env:TEMP
tar -xzf $Temp_Path # extract gzip
$Path_Arch = (Get-ChildItem *$Name_Module* -Directory).FullName
Remove-Item "$Module_Path\$Name_Module" -Recurse -Force
Copy-Item -Path "$Path_Arch\Module\pSyslog" -Destination "$Module_Path\" -Recurse
Get-ChildItem $Module_Path\$Name_Module

Remove-Item $Temp_Path
Remove-Item $Path_Arch -Recurse
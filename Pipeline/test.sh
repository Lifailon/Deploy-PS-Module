State=Stop;
ServiceName=cron;
systemctl status *$ServiceName* | grep -iP "Active:|Loaded:| - ";
echo выбрано $State;
if [[ $State -eq "Start" ]];
then echo условие start; systemctl start $ServiceName;
elif [[ $State -eq "Stop" ]];
then echo условие stop; systemctl stop $ServiceName; 
else echo условие none;
fi
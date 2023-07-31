State=Stop;
ServiceName=cron;
echo $State;
echo $ServiceName;
systemctl status -a *$ServiceName* | grep -iP "Active:|Loaded:| - ";
if [[ $State -eq "Start" ]]; then systemctl start $ServiceName; echo "if start";
elif [[ $State -eq "Stop" ]]; then systemctl stop $ServiceName; echo "if stop";
else echo "else"; fi
systemctl status   -a *$ServiceName* | grep -iP "Active:|Loaded:| - ";
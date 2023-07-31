State=Stop;
ServiceName=cron;
echo $State;
echo $ServiceName;
systemctl status -a *$ServiceName* | grep -iP "Active:|Loaded:| - ";
if [[ $State == "Start" ]]; then systemctl start $ServiceName; echo "if start"; fi;
if [[ $State == "Stop" ]]; then systemctl stop $ServiceName; echo "if stop"; fi;
systemctl status   -a *$ServiceName* | grep -iP "Active:|Loaded:| - ";
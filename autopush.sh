#/bin/sh
msg=$(date "+  %F %H:%M:%S auto push via robot" )

echo ${msg}
git checkout robot
git pull
echo -e '- '${msg}'\n' >> daily-rolling.md
git add .
git commit -m "${msg}"
git push origin robot
echo 'auto push at '${msg}

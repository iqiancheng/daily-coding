# Auto Pusher
Auto push code to github regularly.

## Usage 
```sh
$ crontab -e
```
add the following lines:
```bash
# auto push to github
45 23 * * 1-5 cd /usr/local/xxxx/daily-coding && sh autopush.sh &
```
##Review
review ``autopush.sh``, simple as well
```bash
#/bin/sh
msg=$(date "+  %F %H:%M:%S auto push via robot" )

echo ${msg}
git checkout robot
git pull
echo -e '- '${msg}'\n' >> daily-rolling.md # echo -e 转义; \n 代表换行
git add .
git commit -m "${msg}"
git push origin robot
echo 'auto push at '${msg}
```

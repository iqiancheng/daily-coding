# Robot push
Auto push code to github regularly.

## Usage 
```sh
$ crontab -e
```
add the following line:
```bash
# auto push to github
45 23 * * 1-5 cd /usr/local/xxxx/daily-coding && sh autopush.sh &
```

#! /bin/bash
echo ${DATE:-no date set so echo this message without setting the date variable}
echo ${DATE:?date not set, please give a value}
# ${DATE:=tomorrow} Sets the DATE var to tomorrow if not set
echo ${@:1:1} # prints arguments with offset for length 1 (in this case the first argument to the script)
echo $DATE

#! /bin/bash
echo ${DATE:-dateNotSet}
echo ${DATE:?date not set, setting to tomorrow}
${DATE:=tomorrow}
echo $DATE

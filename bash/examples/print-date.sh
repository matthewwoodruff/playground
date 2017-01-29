#! /bin/bash

DATE=$(date '+%d-%m-%y')
DAY_AND_MONTH=${DATE%-*}

echo The day is ${DAY_AND_MONTH%-*}
echo The month is ${DAY_AND_MONTH#*-}
echo The year is ${DATE##*-}

#!/bin/bash

search_dir=C:/FullStack/SpringCloud/q3-spring-cloud/session1/RTC-Client-plainJavaLib-6.0.6.1

for entry in `ls $search_dir`; do
    # echo $entry
    if [ ${entry##*.} == "jar" ]
    then
    echo ${entry%.*}
    # put jar name into maven
    fi
done
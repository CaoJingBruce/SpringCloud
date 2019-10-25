#!/bin/bash

search_dir=rtclibs
project.basedir="${project.basedir}"

for entry in `ls $search_dir`; do
    # echo $entry
    if [ ${entry##*.} == "jar" ]
    then
    # echo ${entry%.*}
    # pwd
    echo "<dependency>"
    echo     "<groupId>com.ibm.team</groupId>"
    echo     "<artifactId>${entry%.*}</artifactId>"
    echo     "<version>6.0.6.1</version>"
    echo     "<scope>system</scope>"
    echo     '<systemPath>{project.basedir}/rtclibs/'"${entry%.*}.jar</systemPath>"
    echo "</dependency>"
    fi
done
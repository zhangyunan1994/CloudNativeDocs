#!/bin/sh


CURRENT_DIR=$(dirname $0)
PID_FILE=${CURRENT_DIR}/web-console.pid
PROJECT='web-console'
PROJECT_EXE='web-console'
LOG_FILE='web-console.log'

echo "Start service [${PROJECT}]."
./${PROJECT_EXE} >> ${LOG_FILE} 2>&1

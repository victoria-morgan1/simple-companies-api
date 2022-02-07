#!/bin/bash
APP_DIR=$(dirname “$0”)
PORT=8080
exec java ${JAVA_MEM_ARGS} -jar -Dserver.port=“${PORT}” “target/companies-0.0.1.jar”
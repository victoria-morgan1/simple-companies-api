#!/bin/bash
APP_DIR=$(dirname "$0")
PORT=8080
java -Dserver.port="${PORT}" -jar "${APP_DIR}/target/companies-0.0.1.jar"
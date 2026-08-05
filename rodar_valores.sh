#!/bin/bash
# script para rodar os métodos
# OBS : nesse programa foi usado o java 21

set -e

mkdir -p out

javac -d out $(find desafio -name "*.java")

java -cp out Main "$@"
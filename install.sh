#!/bin/bash
mvn3 install:install-file -Dfile=./build/libs/msgraph-sdk-java.jar -DpomFile=./pom.xml -Dpackaging=jar


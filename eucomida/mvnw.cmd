@echo off
set BASE_DIR=%~dp0
set MVNW_JAR=%BASE_DIR%.mvn\wrapper\maven-wrapper.jar
set MVNW_PROPERTIES=%BASE_DIR%.mvn\wrapper\maven-wrapper.properties

if not exist "%MVNW_JAR%" (
  echo Baixando Maven Wrapper...
  mkdir "%BASE_DIR%.mvn\wrapper"
  powershell -Command "Invoke-WebRequest -Uri https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar -OutFile %MVNW_JAR%"
  echo distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.8.6/apache-maven-3.8.6-bin.zip > "%MVNW_PROPERTIES%"
)

java -jar "%MVNW_JAR%" %*

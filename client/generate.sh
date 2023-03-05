rm -rf java
openapi-generator generate -i http://localhost:8000/openapi.json -g java -o java
cd java/
mvn install

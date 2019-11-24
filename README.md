# k-complementary-pairs
Algorithm to find K-complementary pairs in a given array of integers 

## How to test this program
There are two ways for execute this program:
 - Offline
 - Online

### Offline
To execute offline it's necessary package the program with maven:
 ```shell script
mvn clean install
 ```
In second place, run with java:

```shell script
# Sample with text 10 and numbers from 0 to 9
java -jar target/k-complementary-pairs-1.0-SNAPSHOT.jar 10 0,1,2,3,4,5,6,7,8,9
```
**NOTE this program works with Java 11**

### Online
To execute this program online execute a HTTP call to:
 - **url:** https://l45h8g1103.execute-api.eu-west-3.amazonaws.com/release/k-complementary-pairs
 - **method:** POST
 - **body:** A json with two properties: k (integer) and values (integer arrays).
```shell script
# Sample with text 10 and numbers from 0 to 9
curl -X POST \
  https://l45h8g1103.execute-api.eu-west-3.amazonaws.com/release/k-complementary-pairs \
  -H 'content-type: application/json' \
  -d '{"k": 10, "values": [0,1,2,3,4,5,6,7,8,9]}'
```
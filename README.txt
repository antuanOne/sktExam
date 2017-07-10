java -jar -Dspring.profiles.active=receiver target/demo-0.0.1-SNAPSHOT.jar
java -jar -Dspring.profiles.active=sender target/demo-0.0.1-SNAPSHOT.jar --counter=7

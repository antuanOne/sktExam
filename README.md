#H1 SKT Exam

Steps to run build and run the application


1. Build the application 
mvn clean install -DskipTests

2. Send messages 
#4 java -jar -Dspring.profiles.active=sender target/demo-0.0.1-SNAPSHOT.jar --counter=10

3. Receive messages
#4 java -jar -Dspring.profiles.active=receiver target/demo-0.0.1-SNAPSHOT.jar

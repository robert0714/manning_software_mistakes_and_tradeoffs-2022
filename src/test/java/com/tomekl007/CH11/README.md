```bash

mvn clean compile compiler:testCompile -DaddResourcesToClasspath=true -Dexec.classpathScope=test exec:java -Dexec.mainClass="com.tomekl007.CH11.SpringKafkaApplication"

mvn test -Dtest=com.tomekl007.CH11.AllSpringKafkaTests 
mvn test -Dtest=com.tomekl007.CH11.consumer.SpringKafkaReceiverTest 
mvn test -Dtest=com.tomekl007.CH11.producer.SpringKafkaSenderTest
```
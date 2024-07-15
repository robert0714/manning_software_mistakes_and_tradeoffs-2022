
## Java Microbenchmark Harness (JMH)
* [source](https://github.com/openjdk/jmh)
* [example code](https://github.com/openjdk/jmh/tree/master/jmh-samples/src/main/java/org/openjdk/jmh/samples)
```
mvn clean test -Dtest=com.tomekl007.CH05.WordExistsPerformanceTestRunner

mvn clean compile compiler:testCompile -DaddResourcesToClasspath=true -Dexec.classpathScope=test exec:java -Dexec.mainClass="com.tomekl007.CH05.WordExistsPerformanceTestRunner"
```
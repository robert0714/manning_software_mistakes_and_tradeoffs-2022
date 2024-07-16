
## Java Microbenchmark Harness (JMH)
* [source](https://github.com/openjdk/jmh)
* [example code](https://github.com/openjdk/jmh/tree/master/jmh-samples/src/main/java/org/openjdk/jmh/samples)
```bash
mvn clean test -Dtest=com.tomekl007.CH05.WordExistsPerformanceTestRunner

mvn clean compile compiler:testCompile -DaddResourcesToClasspath=true -Dexec.classpathScope=test exec:java -Dexec.mainClass="com.tomekl007.CH05.WordExistsPerformanceTestRunner"
```
## Creating API performance tests using Gatling
* see https://gatling.io/open-source/
```bash
# http://localhost:8080/words/word-of-the-day
# http://localhost:8080/words/word-exists?word=assist
mvn clean compile compiler:testCompile -DaddResourcesToClasspath=true -Dexec.classpathScope=test exec:java -Dexec.mainClass="com.tomekl007.CH05.HttpApplication"
```

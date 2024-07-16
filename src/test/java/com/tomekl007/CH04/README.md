
## Java Microbenchmark Harness (JMH)
* [source](https://github.com/openjdk/jmh)
* [example code](https://github.com/openjdk/jmh/tree/master/jmh-samples/src/main/java/org/openjdk/jmh/samples)
```bash
mvn clean test -Dtest=com.tomekl007.CH04.HttpClientExecutionTest
mvn clean test -Dtest=com.tomekl007.CH04.external.metrics.HttpClientExecutionTest
mvn clean test -Dtest=com.tomekl007.CH04.hooks.HttpClientExecutionTest
mvn clean test -Dtest=com.tomekl007.CH04.listeners.HttpClientExecutionTest
```
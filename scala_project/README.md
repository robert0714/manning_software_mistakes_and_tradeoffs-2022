## main
```bash
mvn clean compile compiler:testCompile -DaddResourcesToClasspath=true -Dexec.classpathScope=test exec:java -Dexec.mainClass="com.tomekl007.CH05.WordExistsPerformanceTestRunner"
```


## scala-maven-plugin
* https://davidb.github.io/scala-maven-plugin/usage.html 
```bash
mvn clean scala:compile -DdisplayCmd=true -DrecompileMode=all 

mvn gatling:test 
```
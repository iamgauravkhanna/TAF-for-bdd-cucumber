foo="--plugin html:target/cucumber-"$(date +%Y-%m-%d-%H-%M-%S)".html"

echo $foo

mvn clean install test \
-Dcucumber.filter.tags="@login" \
-Dbrowser=chrome \
-DexecutionEnvironment=local \
-DtestEnvironment=qa
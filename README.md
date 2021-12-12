# Log4j test code

Do you also hate Java, but would like to test this log4j nonsense? Have fun.

Uses log4j 2.14.0

Edit `vuln_vic/src/main/java/ihatejava/App.java`.

Build:
```
$ cd vuln_vic
$ mvn clean compile exec:java
```

Something hangs in log4j and causes this to not exit properly, feel free to ^C or just let it timeout and die on its own after a few seconds. If you know how to fix this, pls open an issue/PR/ping me on [Twitter](https://twitter.com/captainGeech42).
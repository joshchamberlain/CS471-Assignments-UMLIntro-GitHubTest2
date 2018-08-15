# Checkstyle
## Eclipse Plugin
In Eclipse, sometimes the option to add a new local checkstyle configuration disappears. You may need to close Eclipse and re-launch it.

## Maven
The maven checkstyle plugin uses some older versions that may not be compatible with all of the settings you need. You may want to update your pom.xml to explicitly declare the dependencies like this:
```xml
    <build>
        <plugins>
            ....
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-checkstyle-plugin</artifactId>
                <version>3.0.0</version>
                <dependencies>
                    <dependency>
                        <groupId>com.puppycrawl.tools</groupId>
                        <artifactId>checkstyle</artifactId>
                        <version>8.12</version>
                    </dependency>
                </dependencies>
                <configuration>
                    <configLocation>${custom.checkstyle}</configLocation>
                </configuration>
            </plugin>
        </plugins>
    </build>
```


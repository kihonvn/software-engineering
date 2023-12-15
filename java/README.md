# Java

## Install

### Linux

You need `root` privilege to put `java` link in the `/usr/bin` directory. 

```shell
mkdir /opt/java
cd /opt/java
wget https://download.java.net/java/GA/jdk21.0.1/415e3f918a1f4062a0074a2794853d0d/12/GPL/openjdk-21.0.1_linux-x64_bin.tar.gz
tar -xf openjdk-21.0.1_linux-x64_bin.tar.gz
alternatives --install /usr/bin/java java /opt/java/jdk-21.0.1/bin/java 1
alternatives --install /usr/bin/javac javac /opt/java/jdk-21.0.1/bin/javac 1
java -version
```

If we install Java successfully, the shell would display as follows:

```
openjdk version "21.0.1" 2023-10-17
OpenJDK Runtime Environment (build 21.0.1+12-29)
OpenJDK 64-Bit Server VM (build 21.0.1+12-29, mixed mode, sharing)
```

## The first Java program

Use `vi` editor to create a draft file `HelloVPS.java`

```shell
vi HelloVPS.java
```

Copy and paste the below codes into the editor, then save it (`:x!`)

```java
public class HelloVPS {
    public static void main(String[] args) {
        System.out.println("Hello, my VPS!");
    }
}
```

Run `HelloVPS.java`

```shell
java HelloVPS.java
```

The output should be

```
Hello, my VPS!
```
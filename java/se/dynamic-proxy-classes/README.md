# Dynamic Proxy Classes

## Properties

- `public` and not `abstract`
- implements `java.lang.reflect.InvocationHandler` interface

## Example

```java
public interface IExample {
  String getString();
}
```

```java
public class Example implements IExample {
  @Override
  public String getString() {
    return "A string";
  }
}
```

```java
public class MyProxy implements InvocationHandler {
  private final IExample target = new Example();

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(target, args);
  }
}
```

```java
ClassLoader classLoader = ...;
Class[] interfaces = new Class[] { IExample };
MyProxy proxy = new MyProxy();

IExample exampleProxy = (IExample) Proxy.newProxyInstance(classLoader, interfaces, proxy);
System.out.println(exampleProxy.getString());
```
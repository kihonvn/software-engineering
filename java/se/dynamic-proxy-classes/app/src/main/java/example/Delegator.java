package example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Delegator implements InvocationHandler {

  private final App app = new AppImpl();

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println(method.getName());
    return method.invoke(app, args);
  }
  
}

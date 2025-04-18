package pjReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

public class JavaReflections {

    public static void main(String[] args) throws ClassNotFoundException, 
    NoSuchMethodException, SecurityException, 
    InstantiationException, IllegalAccessException, 
    IllegalArgumentException, InvocationTargetException {
        
        Class cls = Class.forName("pjReflection.Bank");

        Class[] argType = new Class[4];
        argType[0] = Integer.TYPE;
        argType[1] = String.class;
        argType[2] = Double.TYPE;
        argType[3] = Integer.TYPE;

        Constructor constructor = cls.getConstructor(argType);

        Object argumentsValue[] = new Object[4];
        argumentsValue[0] = Integer.valueOf(1);
        argumentsValue[1] = "Bank of America";
        argumentsValue[2] = Double.valueOf(1.500);
        argumentsValue[3] = Integer.valueOf(2500);

        Object obj = constructor.newInstance(argumentsValue);
        System.out.println(obj);
        
        //List Fields
        Stream.of(cls.getDeclaredFields())
                .forEach(field ->
                        System.out.println(
                                "Field name: " + field.getName() + "\n" +
                                "Field type: " + field.getType() + "\n" +
                                "************"));
        
        //List Methods
        Stream.of(cls.getDeclaredMethods())
                .forEach(m -> System.out.println(
                        "Method name: " + m.getName() + "\n" +
                        "Method type: " + m.getReturnType() + "\n" +
                        "************"));
        
        //Invoking methods
        Class argumentsType[] = new Class[1];
        argumentsType[0] = Double.TYPE;
        Method method = cls.getMethod("doDeposit", argumentsType);
        Object invokeMethod = method.invoke(new Bank(), Double.valueOf(145.85));
        System.out.println(invokeMethod);
    }
}
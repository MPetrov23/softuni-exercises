package JavaAdvanced.OOP.ReflectionAndAnnotations.Lab._2_GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Class reflection = Reflection.class;

        Method[] methods = reflection.getDeclaredMethods();
        sort(methods);

        for(Method method : methods){
            if(method.getName().startsWith("get") && method.getParameterCount()==0) {
                System.out.printf("%s will return class %s\n", method.getName(), method.getReturnType());
            }
        }
        for(Method method : methods){
            if(method.getName().startsWith("set") && method.getParameterCount()==1) {
                System.out.printf("%s and will set field of class %s\n", method.getName(), method.getParameterTypes()[0].getTypeName());
            }
        }
    }

    public static void sort(Method[] methods) {
        Arrays.sort(methods, Comparator.comparing(Method::getName));
    }
}

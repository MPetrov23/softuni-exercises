package JavaAdvanced.OOP.ReflectionAndAnnotations.Ex._2_BlackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner sc = new Scanner(System.in);

        Class<BlackBoxInt> clas = BlackBoxInt.class;

        Constructor<BlackBoxInt> constructor = clas.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        Field innerValue = clas.getDeclaredField("innerValue");
        List<Method> methods = Arrays.asList(clas.getDeclaredMethods());

        String command = sc.nextLine();
        while (!"END".equals(command)) {
            String[] commandParts = command.split("_");
            String commandName = commandParts[0];
            int n = Integer.parseInt(commandParts[1]);
            Method method = null;

            for (Method currentMethod : methods) {
                if (currentMethod.getName().equals(commandName)) {
                    method = currentMethod;
                    break;
                }
            }

            method.setAccessible(true);
            method.invoke(blackBoxInt, n);
            innerValue.setAccessible(true);
            System.out.printf("%d%n",innerValue.get(blackBoxInt));
            command = sc.nextLine();
        }
    }
}

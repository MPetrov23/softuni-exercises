package JavaAdvanced.OOP.ReflectionAndAnnotations.Lab._5_CodingTracker;

import java.lang.reflect.Method;

public class Tracker {
    @Author(name = "George")
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        printMethodsByAuthor(Tracker.class);
    }

    @Author(name = "Peter")
    public static void printMethodsByAuthor(Class<?> clas) {
        Method[] methods = clas.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Author.class)) {
                Author authorAnnotation = method.getAnnotation(Author.class);

                System.out.println(authorAnnotation.name() + ": " + method.getName() + "()");
            }
        }
    }
}

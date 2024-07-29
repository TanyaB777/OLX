package hw_14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task1 {
    public static void main(String[] args) {

        try {

            Class<?> studentClass = Class.forName("hw_14.Student");

            Constructor<?> constructor = studentClass.getConstructor(String.class, int.class, String.class);
            Object studentInstance = constructor.newInstance("Lina", 25, "Bezuglaya");
            Method infoMethod = studentClass.getMethod("info");

            infoMethod.invoke(studentInstance);

            Method privateMethod = studentClass.getDeclaredMethod("privateDisplayMethod", String.class);

            privateMethod.setAccessible(true);
            privateMethod.invoke(studentInstance, "Hello!");

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

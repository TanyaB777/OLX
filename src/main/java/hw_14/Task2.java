package hw_14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static hw_14.Person.mergeLists;

public class Task2 {

    public static Map<String, Object> servicesMap = new HashMap<>();

    public static void main(String[] args) {

        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("D", "E", "F");
        List<String> list3 = List.of("G", "H", "I");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        List<String> mergedList = mergeLists(list1, list2, list3);

        System.out.println(mergedList);

        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

        loadService("hw_14.SimpleService");
        loadService("hw_14.LazyService");
        loadService("java.lang.String");

        for (Map.Entry<String, Object> entry : servicesMap.entrySet()) {
            System.out.println("___" + entry.getKey());

            Object service = entry.getValue();
            Class<?> serviceClass = service.getClass();

            System.out.println(serviceClass.getName());

            for (Method method : serviceClass.getDeclaredMethods()) {

                if (method.isAnnotationPresent(Init.class)) {

                    try {
                        method.invoke(service);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println("---Class: " + service.getName() + " " + ann.name());
        } else {
            System.out.println("---Class: " + service.getName() + " Annotation not found");
        }

        for (Method method : service.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Init.class)) {
                Init ann = method.getAnnotation(Init.class);
                System.out.println("Method: " + method.getName() + " " + ann.toString());
            } else {
                System.out.println("Method: " +method.getName() + " Annotation not found");
            }
        }
    }

    public static void loadService(String className) {
        try {
            Class<?> clazz = Class.forName(className);

            if (clazz.isAnnotationPresent(Service.class)) {
                Object serviceObj = clazz.getDeclaredConstructor().newInstance();

                servicesMap.put(clazz.getName(), serviceObj);
            }
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}

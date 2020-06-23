package avia;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        List<String> stringList = new ArrayList<>();
        Flight flight = new Flight(1,1,"123","234");
        Class class1 = flight.getClass();
        Class class2 = Flight.class;
        Class class3 = Class.forName("avia.Flight");
//        Class<String> stringClass = String.class;
//        stringClass.getNestHost();
//        String string = new String();
        System.out.println(class1 == class2);
        System.out.println(class2 == class3);
        System.out.println(class1 == class3);
        Object object = class3.newInstance();
//        if(object instanceof Flight) {
//            Flight flight1 = (Flight) object;
//            System.out.println(object.getClass());
//        }
        Method[] methods = class3.getMethods();
        for(Method method: methods){
            System.out.println(method);
        }
        System.out.println(")))))))))))))");
        Method[] methods1 = class3.getDeclaredMethods();
        for(Method method: methods1){
            System.out.println(method);
        }
        System.out.println(")))))))))))))");
        Field[] fields = class3.getFields();
        for(Field field: fields){
            System.out.println(field);
        }
        System.out.println(")))))))))))))");
        Field[] fields1 = class3.getDeclaredFields();
        for(Field field: fields1){
            System.out.println(field);
        }
        System.out.println(")))))))))))))");
        Annotation[] annotations = class1.getAnnotations();
        for(Annotation annotation : annotations){
//            if(annotation instanceof Author){
//                System.out.println("I got this annotation");
//            }
            System.out.println(annotation);
        }

        Class cs = String.class;
        Method m = cs.getMethod("indexOf", String.class, int.class);
        System.out.println(m.toString());
        try {
            int k = (int) m.invoke(new String("bca"),new Object[]{"bc",0});
            System.out.println(k);
        } catch (InvocationTargetException e) {
            throw new IllegalStateException(e);
        }
        //достать конструктор с помощью ревлекции в java
    }
}

package day06.api.reflectionEx;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String str = new String("Class클래스 테스트");
        Class<? extends String> cls = str.getClass();
        System.out.println(cls);

        //.class 리터럴로 얻기
        Class<? extends String> cls2 = String.class;
        System.out.println(cls2);

        //Class.forName()
        try {
            Class<?> cla3 = Class.forName("java.lang.String"); //동적 로딩
            System.out.println(cla3);
        }catch(Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(cls.getSimpleName());
        System.out.println(cls.getPackage());
        System.out.println(cls.getName());
        System.out.println(cls.toString());

        System.out.println(Arrays.toString(cls.getFields()));
        System.out.println(Arrays.toString(cls.getMethods()));
        System.out.println(Arrays.toString(cls.getInterfaces()));
    }
}

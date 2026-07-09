package SpringCore.setterInjectionWithPrimitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringCore/setterInjectionWithPrimitive/application-context.xml");

        System.out.println("========= Setter Injection =========");
        BookInfo setter = context.getBean("setterBook", BookInfo.class);
        IO.println(setter);    

     }
}
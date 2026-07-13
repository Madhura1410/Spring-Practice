package SpringCore3.Program04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringCore3/Program04/application-context.xml");

        System.out.println("========= Setter Injection =========");
        Book setter = context.getBean("setterBook", Book.class);
        setter.displayBook();

        System.out.println();

        System.out.println("====== Constructor Injection ======");
        Book constructor = context.getBean("constructorBook", Book.class);
        constructor.displayBook();
    }
}
package SpringCore.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

       
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringCore/CollectionType/application-context.xml");

     
        FoodCart foodCart = (FoodCart) context.getBean("FoodCart");

        System.out.println(foodCart);

   
        ((ClassPathXmlApplicationContext) context).close();
    }
}
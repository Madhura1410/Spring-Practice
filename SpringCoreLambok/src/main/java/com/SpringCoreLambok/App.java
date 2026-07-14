package com.SpringCoreLambok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCoreLambok/Application-Context.xml");
       
      Employee emp = context.getBean("employee", Employee.class);
      
      IO.println(emp);
    }
}

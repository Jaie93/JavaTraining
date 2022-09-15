package com.springdemo.Springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
       Employee e = (Employee) context.getBean("employee");
       System.out.println(e);
       Employee e1 = (Employee) context.getBean("employee1");
       System.out.println(e1);
       Employee e2 = (Employee) context.getBean("employee2");
       System.out.println(e2);
       PrintMessage message = (PrintMessage) context.getBean("printmessage");
       System.out.println(message);
       ConstructorMessage constructorMessage = (ConstructorMessage) context.getBean("constructormessage");
       System.out.println(constructorMessage);

    }
}

package com.Springcore;

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
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Student student = (Student)context.getBean("Student1");
       
        System.out.println(student);
        
        Student s = (Student)context.getBean("Student2");
        
        System.out.println(s);
        
        Student student2 = (Student)context.getBean("Student3");
        System.out.println(student2);
        
   }
}

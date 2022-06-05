package com.scaler.springcore;

import com.scaler.springcore.beans.Course;
import com.scaler.springcore.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringcoreApplication {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");

   //  BeanFactory factory=new XmlServletWebServerApplicationContext(); Another way to create Container -> check constructor of XMLBeanFactory

//       var student=(Student)context.getBean("student");
//       System.out.println(student+" "+  student.firstName);


        Course course=(Course)context.getBean("course");
        System.out.println("Course Object: "+course);


    }
}

/**
 *
 * 1) Create Bean
 * 2) Create Container/Spring Context
 * 3) Retrieve Bean/objects from the container
 */


/**
 *   Dependency Injection
 *   Student -> Course -> Department
 *   Student -> Course -> Department -> Student  => Circular Dependency  [Cause exception]
 *
 *   DI
 *     i) Constructor base DI
 *     ii) Setter base DI
 */























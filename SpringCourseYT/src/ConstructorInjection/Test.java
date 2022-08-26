package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ConstructorInjection/ConstructorInjectionConfig.xml");

        Person person=(Person) context.getBean("person");
        Addition addition=(Addition) context.getBean("add");

        System.out.println(person);
        addition.doSum();
    }
}

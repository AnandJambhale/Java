package AutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("AutoWired/AutowireConfig1.xml");

        Employee emp=(Employee) context.getBean("emp");

        System.out.println(emp);
    }
}

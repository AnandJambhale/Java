package AutowireAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ComponentScan
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("AutowireAnnotations/AutowireConfig2.xml");

        Employee emp=context.getBean("emp",Employee.class);

        System.out.println(emp);
    }
}

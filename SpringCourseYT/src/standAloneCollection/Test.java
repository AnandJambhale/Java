package standAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("standAloneCollection/AloneConfig.xml");

        Person per=context.getBean("person", Person.class);

        System.out.println(per);
    }
}
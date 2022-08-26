package lifecycle;

import com.springcore.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycle/lifecycleConfig.xml");

//        Samosa samosa=(Samosa) context.getBean("samosa");
//
//        System.out.println(samosa.getPrice());
//
//        //registering shutdown hook
        context.registerShutdownHook();
//
//        System.out.println("******************************************");
//
//        Pepsi pepsi=(Pepsi) context.getBean("pepsi");
//        System.out.println(pepsi);

        Example ex=(Example) context.getBean("ex.");
        System.out.println(ex);


    }
}

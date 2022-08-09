package exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

        Coach cok=context.getBean("battingcoach",Coach.class);

        System.out.println(cok.getDailyWorkout());

        context.close();
    }
}

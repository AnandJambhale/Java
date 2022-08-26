package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private  String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example() {
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct    //using annotation to init
    public void Start(){
        System.out.println("Starting method");
    }

    @PreDestroy      //using annotation to destroy
    public void end(){
        System.out.println("Ending Method");
    }
}

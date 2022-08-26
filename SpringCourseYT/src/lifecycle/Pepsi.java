package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {    //implementing init and destroy method using InitializingBean and DisposableBean interface
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pepsi() {
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //its init
        System.out.println("Taking pepsi");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Going to put bottle in shop");
    }
}

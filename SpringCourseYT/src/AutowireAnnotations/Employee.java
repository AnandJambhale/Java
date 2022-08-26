package AutowireAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired
    @Qualifier("temp")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }

    public Employee() {
        super();
    }

    public Employee(Address address) {
        System.out.println("Inside Constructor");
        this.address = address;
    }
}

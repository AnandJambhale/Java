package collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String name;

    private List<String>phones;

    private Set<String> address;

    private Map<String, String>course;

    private Properties properties;

    public Emp() {
    }

    public Emp(String name, List<String> phones, Set<String> address, Map<String, String> course) {
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                ", course=" + course +
                ", Properties=" +  properties+
                '}';
    }
}

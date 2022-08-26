package standAloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;

    private Map<String, Integer> feesStructure;

    private Properties props;

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Person(List<String> friends) {
        this.friends = friends;
    }

    public Person() {
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFeesStructure() {
        return feesStructure;
    }

    public void setFeesStructure(Map<String, Integer> feesStructure) {
        this.feesStructure = feesStructure;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                "feesStructure="+feesStructure +
                "Properties="+props+
                '}';
    }
}
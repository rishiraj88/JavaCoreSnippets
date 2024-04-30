package stream;

import java.util.List;

public class Customer {
    private String name;
private List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public String getName() {
        return name;
    }

    public Customer(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }
}

package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMappingDemo {
        public static void main(String[] args) {
                List<Customer> customers = List
                                .of(new Customer("name", List.of(new Address("H104", "Str110", "10102", "USB"))));
                Map<String, List<Address>> addressesByCustomerName = customers.stream()
                                .collect(Collectors.toMap(Customer::getName, Customer::getAddresses));
                addressesByCustomerName.forEach(
                                (cust, addresses) -> System.out.printf(
                                                cust + " stays at " + addresses.stream().map(a -> a.toString()).collect(
                                                                Collectors.joining(", "))));
        }
}

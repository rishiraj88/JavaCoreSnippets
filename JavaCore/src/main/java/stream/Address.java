package stream;

public class Address {
    private String houseNr;
    private String steetCode;
    private String zipCode;
    private String country;

    public Address(String houseNr, String steetCode, String zipCode, String country) {
        this.houseNr = houseNr;
        this.steetCode = steetCode;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getSteetCode(){
        return steetCode;
    }

    @Override
    public String toString() {
        return String.format("H.No. %s, %s, %s, %s",houseNr,steetCode,zipCode,country.toUpperCase());
    }
}

package bookmyshow;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    public Address(String street, String city, String state, String zip, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
    public String getCity(){
        return city;
    }
}

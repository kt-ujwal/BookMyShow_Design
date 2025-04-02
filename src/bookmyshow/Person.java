package bookmyshow;

public class Person {
    private final String name;
    private Address address;
    private String email;
    private String phone;
    Account account;
    Person(String name, Address address, String email, String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
    protected String getName() {
        return name;
    }
    protected Address getAddress() {
        return address;
    }
    protected String getEmail() {
        return email;
    }
    protected String getPhone() {
        return phone;
    }
    protected void setAddress(Address address) {
        this.address = address;
    }
    protected void setEmail(String email) {
        this.email = email;
    }
    protected void setPhone(String phone) {
        this.phone = phone;
    }
    protected Account getAccount() {
    return account;
    }
    protected void setAccount(Account account) {
        this.account = account;
    }


}

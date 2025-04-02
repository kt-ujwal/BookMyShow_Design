package bookmyshow;

public class User extends Person {
    private final String id;

    User(String name, Address address, String email, String phone, String id) {
        super(name, address, email, phone);
        this.id = id;
    }
}

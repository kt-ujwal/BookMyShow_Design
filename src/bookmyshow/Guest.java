package bookmyshow;

public class Guest {
    public boolean registerAccount(String name, Address address, String email, String phone,String password,String id) {
        Account account = new Account(password);
        User user = new User(name,address,email,phone,id);
        user.setAccount(account);
        return true;
    }
}

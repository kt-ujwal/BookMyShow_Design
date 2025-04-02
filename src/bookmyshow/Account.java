package bookmyshow;

import java.util.UUID;

public class Account {
    private String id;
    private AccountStatus status;
    private String password;

    public Account(String password){
        this.id = generateId();
        this.status = AccountStatus.ACTIVE;
        this.password = password;
    }
    public boolean resetPassword() {
        return true;
    }

    public String getId() {
        return id;
    }
    public String generateId(){
        return UUID.randomUUID().toString();
    }
}

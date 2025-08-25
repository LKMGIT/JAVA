package BookStore.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User extends Person {

    private String user_id;
    private String user_password;
    private String phone_number;

    public User(String user_id, String phone_number) {
        this.user_id = user_id;
        this.phone_number = phone_number;
    }
}

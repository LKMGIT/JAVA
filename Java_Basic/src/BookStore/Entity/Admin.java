package BookStore.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Admin extends Person {

    private String admin_name = "admin";
    private String admin_password = "admin1234";

}

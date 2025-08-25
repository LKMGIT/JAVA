package BookStore.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }


}

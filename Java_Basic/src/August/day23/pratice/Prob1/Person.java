package August.day23.pratice.Prob1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;

}

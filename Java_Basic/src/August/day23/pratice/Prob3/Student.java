package August.day23.pratice.Prob3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int grade;
}

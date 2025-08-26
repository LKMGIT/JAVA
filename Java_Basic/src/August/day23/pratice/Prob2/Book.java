package August.day23.pratice.Prob2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    private String title;
    private int price;

}

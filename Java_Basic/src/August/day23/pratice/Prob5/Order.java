package August.day23.pratice.Prob5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    private int orderId;
    private Product product;


}

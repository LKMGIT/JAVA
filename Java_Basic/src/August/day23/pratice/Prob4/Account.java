package August.day23.pratice.Prob4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private String owner;
    private transient int balance;

    @Serial
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.writeUTF(owner);
        oos.writeInt(balance);
    }

    @Serial
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        owner = ois.readUTF();
        balance = ois.readInt();
    }
}

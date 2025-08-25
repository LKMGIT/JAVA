package August.day22.inputstream;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) throws IOException {

        String original = "C:/Temp/test.png";
        String newFileName = "C:/Temp/Copy.png";

        InputStream in = new FileInputStream(original);
        OutputStream out = new FileOutputStream(newFileName);

        /*
        byte[] buf = new byte[in.available()];

        while(true){
            if(in.read(buf) == -1){
                break;
            }
            int numRead = in.read(buf);
            out.write(buf, 0, numRead);
        }*/

        in.transferTo(out);

        out.flush();
        out.close();
        in.close();

    }
}

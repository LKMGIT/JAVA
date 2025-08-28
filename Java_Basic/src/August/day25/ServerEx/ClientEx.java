package August.day25.ServerEx;

import java.io.IOException;
import java.net.Socket;

public class ClientEx {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);
        System.out.println("[클라이언트] 서버와 연결 성공");

        socket.close();
        System.out.println("[클라이언트] 서버와 접속 해제");

    }
}

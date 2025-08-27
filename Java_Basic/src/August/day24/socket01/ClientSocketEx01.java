package August.day24.socket01;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketEx01 {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 50001);
            System.out.println("클라이언트 서버 성공");
            
            socket.close();
            System.out.println("클라이언트 서버 종료");
        
        }catch (IOException e){
            System.out.println("연결 실패");
        }

    }
}

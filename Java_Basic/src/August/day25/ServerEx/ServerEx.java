package August.day25.ServerEx;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) throws Exception {
        serverSocket = new ServerSocket(5000);
        startServer();
        stopServer();
    }

    public static void startServer() throws Exception {

        System.out.println("[서버] 서버 시작");
        serverSocket.accept();
        System.out.println("[서버] 클라이언트와 연결 되었습니다.");

    }

    public static void stopServer() throws Exception {
        serverSocket.close();
        System.out.println("[서버] 클라이언트와 연결이 종료 되었습니다.");
    }
}

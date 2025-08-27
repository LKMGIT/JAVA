package August.day24.socket01;


import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketEx01 {

    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("------------Startign Server Socket -----------------");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하세요 ");
        System.out.println("--------------------------------------------------");


        // TCP 서버 시작
        startServer();

        // 키보드 입력
        Scanner sc = new Scanner(System.in);
        while (true) {
            String key = sc.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }

        //TCP 서버 종료
        stopServer();

    }

    public static void startServer() {
        // 스레드 Thread (실행단위)
        Thread thread = new Thread(){
            public void run() {

                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("서버 시작");
                    while (true) {
                        System.out.println("\n 서버 연결 요청 기다림");
                        //연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트의 정보를 얻기
                        InetSocketAddress ia = (InetSocketAddress)socket.getRemoteSocketAddress();
                        System.out.println("서버 주소: " + ia.getAddress().getHostAddress() + ":" + ia.getPort());
                        
                        //연결 끊기
                        socket.close();
                        System.out.println("서버 종료");


                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }
        };
        thread.start();
    }


    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("서버 종료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package August.day25.Multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Server {

    //일단 포트번호 선언
    static final private int PORT = 5000;
    // 스레드 풀 선언
    static final private ExecutorService POOL = Executors.newCachedThreadPool();  // newCachedThreadPool로 알아서 스레드  생성
    // 증가값 선언
    static final private AtomicInteger CLIENT_SEQ = new AtomicInteger(1);  // 증가 1로 설정

    public static void main(String[] args) throws Exception {

        //서버를 실행.
        System.out.println("[서버] 서버 시작");
        // 서버 소켓 생성
        ServerSocket serverSocket = new ServerSocket(PORT);

        //Ctrl + C 입력시 종료
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {  // addShutdownHook 이 Ctrl + C 누르면 시작함
            System.out.println("\n[서버] 서버 종료...");
            POOL.shutdownNow();
        }));

        while (true) {
            Socket Client_socket = serverSocket.accept();  // 클라이언트 입장 대기
            int seq = CLIENT_SEQ.getAndIncrement(); // 클라이언트 번호 증가 getAndIncrement()는 후위증가
            //클라이언트 인자값 받아서 스레드풀에 넣기
            POOL.submit(new ClientHandler(Client_socket, seq));  // Runnable 인터페이스 타입을 스레드 풀에 저장하는 submit() 메소드
        }
    }

    // 클라이언트 입장, 닉네임 처리
    public static class ClientHandler implements Runnable {
        List<String> names = new ArrayList<>();
        private final Socket Client_socket;
        private final int sequence;

        public ClientHandler(Socket client_socket, int sequence) {
            Client_socket = client_socket;
            this.sequence = sequence;
        }

        @Override
        public void run() {
            try (
                    // 클라이언트의 입력을 받기 위한 BufferedReader
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(Client_socket.getInputStream(), StandardCharsets.UTF_8)
                    );

                    // 서버가 클라이언트 들에게 전달하기 위한 PrintWriter
                    PrintWriter out = new PrintWriter(
                            new OutputStreamWriter(Client_socket.getOutputStream(), StandardCharsets.UTF_8), true
                    );
            ) {

                // 클아이언트의 닉네임 받기
                while (true) {
                    String Client_name = in.readLine(); // 클라이언트 닉네임 받기
                    if (names.contains(Client_name)) { // 입력한 이름이 names 리스트에 존재하면
                        System.out.println("이름이 중복입니다."); // 중복 알림
                    } else {
                        // 중복이 아니면 인사 출력 및 리스트에 저장
                        out.println(Client_name + "반갑습니다!!" + "exit를 입력하시면 종료됩니다.");
                        names.add(Client_name);
                        break;
                    }
                }




            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package August.day24.multiserverecho;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiEchoServer {
    private static final int PORT = 5000;

    // ExecutorService는 작업을 스레드 풀에 맡기는 인터페이스.    Executors.newCachedThreadPool();   는 자바에서 필요시 스레드를 추가생성하거나 재사용 하게 해주는 메소드
    private static final ExecutorService POOL = Executors.newCachedThreadPool();

    // 스레드가 안전하게 카운터를 증가시키기 위한 작업
    private static final AtomicInteger CLIENT_SEQ = new AtomicInteger(1);

    public static void main(String[] args) {
        // 포트 번호 출력
        System.out.println("[Server] Starting on port " + PORT);
        // Ctrl+C 시 스레드 풀 정리
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {  // addShutdownHook 이 Ctrl + C 누르면 시작함
            System.out.println("\n[Server] Shutting down...");
            POOL.shutdownNow();
        }));

        // 서버 소켓 만들기
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();  // 클라이언트 입장 대기
                int id = CLIENT_SEQ.getAndIncrement(); // 클라이언트 ID 자동 증가
                System.out.println("[Server] Client#" + id + " connected from " + socket.getRemoteSocketAddress()); // 클라이언트 번호와 주소 출력
                POOL.submit(new ClientHandler(socket, id));  // 스레드 풀에 클라리언트 추가
            }
        } catch (IOException e) {
            System.err.println("[Server] Error: " + e.getMessage());
        }
    }

    private static class ClientHandler implements Runnable {
        private final Socket socket;
        private final int clientId;

        ClientHandler(Socket socket, int clientId) {
            this.socket = socket;
            this.clientId = clientId;
        }

        @Override
        public void run() {
            try (
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    PrintWriter out = new PrintWriter(
                            new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)
            ) {
                out.println("Welcome! You are Client#" + clientId + ". Type 'exit' to quit.");
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println("[Server] From Client#" + clientId + ": " + line);
                    if ("exit".equalsIgnoreCase(line.trim())) {
                        out.println("Bye Client#" + clientId);
                        break;
                    }
                    // 받은 메시지를 그대로 돌려주는 에코
                    out.println("Echo to #" + clientId + ": " + line);
                }
            } catch (IOException e) {
                System.err.println("[Server] Client#" + clientId + " I/O error: " + e.getMessage());
            } finally {
                try { socket.close(); } catch (IOException ignored) {}
                System.out.println("[Server] Client#" + clientId + " disconnected.");
            }
        }
    }
}

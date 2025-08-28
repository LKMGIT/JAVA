package August.day25.thread;

public class Thread01 {
    public static void main(String[] args) {
        Thread thread = new Thread(){

            public void run() {
                System.out.println(getName() + "실행");
            }
        };

        thread.start();

        Thread chat_thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println(getName() + "실행");
                
            }
        };
        chat_thread1.setName("chatting-thread");
        chat_thread1.start();

    }
}

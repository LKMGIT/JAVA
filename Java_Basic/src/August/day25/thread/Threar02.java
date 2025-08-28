package August.day25.thread;


class Calculator{
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try{
            System.out.println(Thread.currentThread().getName() + " Interrrupted" + this.memory);
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void setMemory2(int memory) {
        synchronized (this){
            this.memory = memory;
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Interrrupted" + this.memory);
        }

    }


}


class User1 extends Thread{
    private Calculator calculator;

    public User1(){
        setName("User1");
    }

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100);
    }
}

class User2 extends Thread{
    private Calculator calculator;

    public User2(){
        setName("User2");
    }

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(200);
    }
}


public class Threar02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        User1 user1 = new User1();
        User2 user2 = new User2();

        user1.setCalculator(calculator);
        user2.setCalculator(calculator);

        user1.start();
        user2.start();

    }
}

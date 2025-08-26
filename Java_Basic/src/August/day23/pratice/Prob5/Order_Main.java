package August.day23.pratice.Prob5;

import java.io.*;

public class Order_Main {
    public static void main(String[] args) throws Exception {
        Order order = new Order(2234, new Product("마우스패드", 32000));

        String path = "C:/Temp/order.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(order);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        try{
            while(true){
                order = (Order) ois.readObject();
                System.out.println("주문자 아이디: " + order.getOrderId());
                System.out.println("주문 상품: " + order.getProduct().getName());
                System.out.println("가격: " + order.getProduct().getPrice());
            }
        }catch(EOFException e){
            System.out.println("더 이상 주문 상품이 없습니다.");
        }finally {
            ois.close();
        }
    }
}

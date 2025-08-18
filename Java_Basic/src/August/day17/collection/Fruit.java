package August.day17.collection;

//과일을 가격 기준으로 오름차순 정렬하는 비교기 구횬

import java.util.NavigableSet;
import java.util.TreeSet;

public class Fruit implements Comparable<Fruit> {

    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Fruit o) {
        if(this.price > o.price) {
            return 1;
        }else if(this.price < o.price) {
            return -1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        TreeSet<Fruit> fruits = new TreeSet<Fruit>();
        fruits.add(new Fruit("사과", 10000));
        fruits.add(new Fruit("귤", 12000));
        fruits.add(new Fruit("복숭아", 8000));
        fruits.add(new Fruit("포도", 18000));

        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + " " + fruit.price);
        }
    }
}

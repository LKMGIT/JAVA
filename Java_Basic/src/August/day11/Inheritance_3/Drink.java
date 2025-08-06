package August.day11.Inheritance_3;

public class Drink {
    public String name;
    public int price;
    public int count;

    public Drink() {
    }

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice(){
        return this.price * count;
    }

    public static void printTitle(){
        System.out.println("""
                ***** 매출전표 *****
                상품명    단가    수량    금액""");
    }

    public void printData(){
        System.out.println(this.name +"     "+this.price +"     "+ this.count +"     "+ getTotalPrice());
    }

}

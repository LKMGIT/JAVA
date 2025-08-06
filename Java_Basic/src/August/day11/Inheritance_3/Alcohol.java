package August.day11.Inheritance_3;

public class Alcohol extends Drink{
    public double alcper;

    public Alcohol(double alcper) {
        this.alcper = alcper;
    }

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }


    public static void printTitle(){
        System.out.println("""
                상품명(도수[%])   단가    수량   금액
                """);
    }


    public void printData(){
        System.out.println(this.name + "("+ this.alcper +")"+ "      "+this.price+ "     "+this.count
        + "     " + price);
    }


}

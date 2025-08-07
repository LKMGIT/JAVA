package August.day12.Task02;

public class Coffee extends Beverage{

    static int amount = 0;

    public Coffee(String name) {
        super(name);
        this.amount++;
        calcPrice();
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public void calcPrice() {
        if(this.getName().equals("Americano")){
            this.setPrice(1500);
        } else if (this.getName().equals("CafeLatte")) {
            this.setPrice(2500);
        } else if (this.getName().equals("Cappuccino")) {
            this.setPrice(3000);
        }
    }
}

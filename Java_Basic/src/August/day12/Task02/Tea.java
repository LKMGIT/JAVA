package August.day12.Task02;

public class Tea extends Beverage{

    static int amount = 0;

    public Tea(String name) {
        super(name);
        this.amount++;
        calcPrice();
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public void calcPrice() {
        if(this.getName().equals("lemonTea")){
            this.setPrice(1500);
        } else if (this.getName().equals("ginsengTea")) {
            this.setPrice(2000);
        } else if (this.getName().equals("redginsengTea")) {
            this.setPrice(2500);
        }
    }

}

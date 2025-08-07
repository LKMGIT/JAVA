package August.day12.Task01;

public class Rectangular extends Shape{
    private double width;
    private String hight;

    public Rectangular(double width, String hight) {
        this.width = width;
        this.hight = hight;
    }

    public Rectangular(String name, double width, String hight) {
        super(name);
        this.width = width;
        this.hight = hight;
    }

    @Override
    public void calculationAera() {
        this.setArea(this.width * Double.parseDouble(hight));
    }

}

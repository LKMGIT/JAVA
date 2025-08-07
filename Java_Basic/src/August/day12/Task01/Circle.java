package August.day12.Task01;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculationAera() {
        this.setArea(radius * radius * 3.14159265389793);
    }
}

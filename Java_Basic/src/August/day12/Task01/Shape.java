package August.day12.Task01;

public abstract class Shape {
    private double area;
    private String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void calculationAera();

    public void print(){
        System.out.println(this.name + "의 면적은 " + this.area);
    }
}

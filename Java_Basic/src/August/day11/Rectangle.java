package August.day11;

public class Rectangle {
    private int width;
    private int height;
    private String color;
    private int area;
    private int paramiter;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getArea() {
        return area;
    }

    public int getParamiter() {
        return paramiter;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setParamiter(int paramiter) {
        this.paramiter = paramiter;
    }

    public int calculateArea(){
        this.area = this.width * this.height;
        return area;
    }

    public int perimeter(){
        return this.width * 2 + this.height *2;
    }

    public int compareArea(Rectangle r2){
        return Integer.compare(this.getArea(), r2.getArea());
    }

    public int comparePerimeter(Rectangle r2){
        return Integer.compare(this.getParamiter(), r2.getParamiter());
    }

}

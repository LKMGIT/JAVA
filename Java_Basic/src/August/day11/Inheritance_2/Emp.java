package August.day11.Inheritance_2;

public class Emp {
    private String id;
    private String name;
    private int baseSalary;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(double bonus){
        return getBaseSalary() + getBaseSalary() * bonus;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")" + "사원의 기본급은 " + baseSalary
                + "원 입니다.";
    }
}

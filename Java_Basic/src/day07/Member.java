package day07;

public class Member {

    public String name;
    public int age;
    public String phone_number;
    public String email;
    public String area;
    public double weight;

    public Member(int age, String name, String phone_number, String email, String area, double weight) {
        this.age = age;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.area = area;
        this.weight = weight;
    }

    public String toString(){
        return String.format("%d %s %s %s %s %.1f", age, name, phone_number, email, area, weight);
    }
}

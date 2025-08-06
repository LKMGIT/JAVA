package August.day11.Inheritance_2;

public class Student {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print(){
        System.out.printf("이  름 : %s   나  이 : %d   학   번 :  %d\n", name, age,id);
    }

}

package August.day11;

public class Employee {

    String name;
    int age;
    String dept;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void print(){
        System.out.printf("이  름 : %s   나  이 : %d   부   서 :  %s\n", name, age,dept);
    }
}

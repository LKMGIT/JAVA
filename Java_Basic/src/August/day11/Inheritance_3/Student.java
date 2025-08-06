package August.day11.Inheritance_3;

public class Student {
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    public Student(String name, String subject, int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getFee() {
        return fee;
    }

    public double getReturnFee() {
        return returnFee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setReturnFee(double returnFee) {
        this.returnFee = returnFee;
    }

    public void calcReturnFee(){
        if(this.subject.equals("javaprogram")){
            this.setReturnFee(fee * 0.25);
        } else if (this.subject.equals("jspprogram")) {
            this.setReturnFee(fee * 0.2);
        } else {
            System.out.println("그런 과정명은 없습니다.");
        }
    }

    public void print(){
        System.out.println(this.name + "씨의 과정명은 "
        + this.subject + " 이고 교육비는 " + this.fee + "이며 환급금은 " + this.returnFee
        + " 입니다.");
    }

    public static void main(String args[]){
        Student stu = new Student("장동건", "jspprogram",
                500000);
        stu.calcReturnFee();
        stu.print();
    }
}

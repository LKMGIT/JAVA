package August.day12.sec9;

public class InstanceofExample {
	//main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) {
		if(person instanceof Student student){
			System.out.println("학번 : " + student.studentNo);
			student.study();
		}else if (person instanceof Person p){
			p.walk();
		}
	}

	public static void main(String[] args) {
		//Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person person1 = new Person("신세계");
		personInfo(person1);

		//Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출

		Person person2 = new Student("이마트", 202020);
		personInfo(person2);

	}
}
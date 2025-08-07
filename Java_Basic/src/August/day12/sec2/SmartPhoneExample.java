package August.day12.sec2;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone mysmartPhone = new SmartPhone("Galaxy", "white");
		SmartPhone mysmartPhone2 = new SmartPhone();

		mysmartPhone.wifi = true;

		//Phone으로부터 상속받은 필드 읽기
		System.out.println(mysmartPhone.model);
		System.out.println(mysmartPhone.color);
		System.out.println(mysmartPhone.wifi);


		System.out.println(mysmartPhone2.model);
		System.out.println(mysmartPhone2.color);
		System.out.println(mysmartPhone2.wifi);

		//SmartPhone의 필드 읽기



		//Phone으로부터 상속받은 메소드 호출

		
		//SmartPhone의 메소드 호출

	}
}
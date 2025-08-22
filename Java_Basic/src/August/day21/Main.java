package August.day21;

import java.util.Optional;

class Person{
    private Phone phoneNumber;  //객체 생성시 초기화
    private String name;

    Person(String name){ this.name=name;    }

    public Phone getPhone() {
        return this.phoneNumber;}
}


class Phone{
    private OS os;

    public OS getOs() {
        return this.os;
    }
}

class OS {
    public String printOS(){
        return "IOS";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        person.getPhone().getOs().printOS();

        Person p1 = new Person("이경민");
        Optional.ofNullable(p1).map(Person::getPhone).map(Phone::getOs).map(OS::printOS);


    }
}

// Optional 클래스 NPE 처리 -> NULL 을 처리하기 위한 Wrapper 클래스
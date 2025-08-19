package August.day18.AnonymousClass;

class Animal{
    public String eat(){
        return "맛있게 먹습니다";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(){
            @Override
            public String eat() {
                run(); // 여기선 사용 가능
                return "강아지 멍멍" ;
            }

            public String run(){
                return "강어지 뛴다";
            }

        };

        dog.eat();
        // dog.run();
    }
}

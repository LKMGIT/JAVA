package August.day13.Task1;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog(8);
        Animal chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);

        System.out.println("1시간 후");
        dog.run(1);
        System.out.println("개의 이동거리 = " + dog.getDistance());
        chicken.run(1);
        System.out.println("닭의 이동거리 = " + chicken.getDistance());
        cheatableChicken.fly();
        cheatableChicken.run(1);
        System.out.println("날으는 닭의 이동거리 = " + cheatableChicken.getDistance());

        System.out.println("3시간 후");
        dog.run(3);
        System.out.println("개의 이동거리 = " + dog.getDistance());
        chicken.run(3);
        System.out.println("닭의 이동거리 = " + chicken.getDistance());
        cheatableChicken.run(3);
        System.out.println("날으는 닭의 이동거리 = " + cheatableChicken.getDistance());


    }
}

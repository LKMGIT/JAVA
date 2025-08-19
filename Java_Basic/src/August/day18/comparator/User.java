package August.day18.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User[] users = new User[]{
                new User("김유신", 64),
                new User("홍길동", 23),
                new User("김동성", 32),
                new User("박희동", 48)
        };

        for (User user : users) {
            System.out.println(user.name);
        }

        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.age, o2.age);
            }

        });

        for (User user : users) {
            System.out.println(user.name);
        }
    }

}

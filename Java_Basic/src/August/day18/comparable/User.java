package August.day18.comparable;

import java.util.Arrays;

public class User implements Comparable<User> {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        if(this.age > o.age){
            return 1;
        }else if(this.age < o.age){
            return -1;
        }else{
            return 0;
        }
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

        Arrays.sort(users);

        for (User user : users) {
            System.out.println(user.name);
        }

    }



}

package August.day10;

public class SingleTone {
    private static SingleTone instance;


    private SingleTone(){

    }

    public static SingleTone getInstance(){
        if(instance == null){
            instance = new SingleTone();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleTone s1 = SingleTone.getInstance();
        SingleTone s2 = SingleTone.getInstance();
        SingleTone s3 = SingleTone.getInstance();
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

    }

}

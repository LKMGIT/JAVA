package July.javabasic;

public class JavaBasic2 {

    public static int sum_fun(){
        int sum = 0;

        for(int i =1; i<=100; i ++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum_fun());

    }
}

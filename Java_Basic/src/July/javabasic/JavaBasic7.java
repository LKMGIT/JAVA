package July.javabasic;

public class JavaBasic7 {
    public static void main(String[] args) {


        for(int i = 1; i<=3; i ++){
            for(int j = 3; j>=i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k < i*2; k++){
                System.out.print("@");
            }
            System.out.println("");
        }
        for(int i = 1; i <=2; i ++){
            for(int j = 0; j <=i; j ++){
                System.out.print(" ");
            }
            for(int k = 4; k >= i *2; k--){
                System.out.print("@");
            }
            System.out.println("");
        }




    }
}

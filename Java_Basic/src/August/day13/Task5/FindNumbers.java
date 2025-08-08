package August.day13.Task5;

public class FindNumbers {

    public static void main(String[] args) {
        FindNumbers fn=new FindNumbers();

        long number = 228754462;
        System.out.println( "입력 숫자 = " + number );
        System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
        System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
    }

    /*  이곳에 countNumber 메소드를 작성하십시오. */
    public int countNumber(long number, int num){
        String check = String.valueOf(number);
        char num2 = (char)('0'+num);
        int count = 0;

        for(int i = 0; i < check.length(); i ++){
            if(check.charAt(i) == num2){
                count++;
            }
        }
        return count;
    }

}
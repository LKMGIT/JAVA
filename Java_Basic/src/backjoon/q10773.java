package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class q10773 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i< num; i ++ )  {
            int s_num = sc.nextInt();
            if(s_num == 0){
                stack.pop();
            }else{
                stack.push(s_num);
            }
        }



        for(int s : stack){

        }


    }
}

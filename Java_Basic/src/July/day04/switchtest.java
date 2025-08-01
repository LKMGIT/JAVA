package July.day04;

import java.util.Scanner;

public class switchtest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("학점을 입력하세요(A-C): ");
        char grade = sc.nextLine().charAt(0);

        switch (grade) {
            case 'A':
                System.out.print("매우 우수");
                break;
            case 'B':
                System.out.print("우수");
                break;
            case 'C':
                System.out.print("노력하세요");
                break;
            default:
                System.out.println("분발하세요");
                break;
        }
    }

}


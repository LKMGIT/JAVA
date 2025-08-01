package July.javabasic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaBasic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int member = 0;
        int[] arr = new int[0];
        int sum = 0;
        double avg = 0.0;

        while (loop) {

            System.out.println("""
                    -------------------------------------------------
                    1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
                    -------------------------------------------------""");

            System.out.print("선택 > ");
            int num = sc.nextInt();

            try {
                switch (num) {
                    case 1:
                        System.out.print("학생수> ");
                        member = sc.nextInt();
                        arr = new int[member];
                        break;
                    case 2:
                        for (int i = 0; i < member; i++) {
                            System.out.printf("scores[%d]> ", i);
                            arr[i] = sc.nextInt();
                            sum += arr[i];
                        }
                        break;
                    case 3:
                        for (int i = 0; i < arr.length; i++) {
                            System.out.printf("score[%d]: %d\n", i, arr[i]);
                        }
                        break;
                    case 4:
                        avg = (double) sum / member;
                        System.out.println("총점 : " + sum);
                        System.out.printf("평균 : %.1f\n", avg);
                        break;
                    case 5:
                        loop = false;
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해야 합니다!");
                sc.nextLine(); // 입력 버퍼 비움
            }catch (Exception e ){
                e.printStackTrace();
            }

        }
        System.out.println("종료");

    }
}

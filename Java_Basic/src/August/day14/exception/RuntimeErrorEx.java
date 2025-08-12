package August.day14.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeErrorEx {
    public static void main(String[] args) {
        try {
            int array[] = {10, 20, 30};
            // System.out.println(array[3]); // ArrayOutofBoundException

            String str = null;
            // System.out.println(str.length()); // NullPointerException

            String stringNumber = "3.1415928228";
            // int number = Integer.parseInt(stringNumber); // NumberFormatException
            double number = Double.parseDouble(stringNumber); // NumberFormatException

            //ClassCastException : 타입변환은 상위 클래스와 하위 클래스간의 상속

            // InputMisMatchException
            // 의도치 않은 입력 오류가 발생할 때 예외
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            sc.close();
        }catch (NumberFormatException e){
            e.getMessage();
        }catch (InputMismatchException e){
            e.getMessage();
        }catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }catch (RuntimeException e){
            e.getMessage();
        } catch (Exception e) {
            e.getMessage();
        } catch (Throwable e) {
            e.getMessage();
        }


    }
}

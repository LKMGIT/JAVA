package August.day15.task;

/*
1. 예외에 대한 설명 중 틀린 것은 무엇입니까?
    - 예외는 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인한 프로그램 오류를 말한다.
    - RuntimeException의 하위 예외는 컴파일러가 예외 처리 코드를 체크하지 않는다.
    - 예외는 try-catch 블록을 사용해서 처리된다.
    - 자바 표준 예외만 프로그램에서 처리할 수 있다. (X)

2. try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까?
    - try {} 블록에는 예외가 발생할 수 있는 코드를 작성한다.
    - catch {} 블록은 try {} 블록에서 발생한 예외를 처리하는 블록이다.
    - try {} 블록에서 return 문을 사용하면 finally {} 블록은 실행 되지 않는다. (X)
    - catch {} 블록은 예외의 종류별로 여러 개를 작성 할 수 있다.

3. throws에 대한 설명으로 틀린 것은 무엇입니까?
    - 생성자나 메소드의 선언 끝 부분에 사용되어 내부에서 발생된 예외를 떠넘긴다.
    - throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.
    - 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성할 수 있다.
    - 새로운 예외를 발생 시키기 위해 사용된다. (X)

4. throw에 대한 설명으로 틀린 것은 무엇입니까?
    - 예외를 최초로 발생시키는 코드이다.
    - 예외를 호출한 곳을 떠넘기기 위해 메소드 선언부에 작성된다.  (X)
    - throw로 발생된 예외는 일반적으로 생성자나 메소드 선언부에 throws로 떠넘겨진다.
    - throw 키워드 뒤에는 예외 객체 생성 코드가 온다.

5. 메소드가 다음과 같이 선언 되어 있습니다. 잘못된 예외 처리를 선택하세요.
  3번. 상위 예외처리가 먼저 선언 되어 뒤어 오는 하위 예외 처리가 오류 발생

6.
 String[] strArray = {"10", "2a"};
        int value = 0;

        for(int i = 0; i<=2; i++){
            try {
                value = Integer.parseInt(strArray[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스를 초과함");
            }catch (NumberFormatException e){
                System.out.println("숫자로 변환할 수 없음");
            }finally {
                System.out.println(value);
            }
        }
10 -> 숫자로 변환할 수 없음 -> 10 -> 인덱스를 초과했음 -> 10

7. login() 메소드에서 존재하지 않는 ID를 입력하면 NotExistDException을




 */



public class ExceptionTesk {
    public static void main(String[] args) {

    }
}

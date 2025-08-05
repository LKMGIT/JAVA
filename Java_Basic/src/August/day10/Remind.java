package August.day10;

/*

1. 참조 타입에 대한 설명으로 틀린 것은 무엇입니까?
   ----> 4. 참조 타입은 null 값으로 초기화 할 수 없다. (null로 초기화 가능)

2. 자바에서 메모리 사용에 대한 설명으로 틀린 것은 무엇입니까?
   ----> 3. 참조되지 않는 객체는 프로그램에서 직접 소멸 코드를 작성하는 것이 좋다.(자바에서는 가비지 컬렉터가 참조 되지 않은 객체를 자동 소멸 시킴)

3. String 타입에 대한 설명으로 틀린 것은 무엇입니까?
    ----> 2. String 타입의 문자열 비교는 ==를 사용해야 한다. (==는 주소 비교. .equals()가 문자열 비교)

4. 배열을 생성하는 방법으로 틀린 것은 무엇입니까?
    ----> 2. int[] array;
             array = {1, 2, 3};

5. 배열의 초기 값에 대한 설명으로 틀린 것은 무엇입니까?
    ----> boolean 타입 배열 항목의 기본 초기값은 true 이다. (false)

6. 3 \n 5

7. 배열 내에서 최대값 찾기 (for 이용)

    int[] array = {1, 5, 3, 8, 2};
       int max = 0;

       for(int i = 0 ; i < array.length; i ++){
           if(max < array[i])
               max = array[i];
       }

        System.out.println(max);

8. 주어진 배열 항목의 전체 합과 평균을 구하는 코드 (중첩 for 이용)

    int[][] array = {{95, 86}, {83, 92, 96}, {78,83,93,87,88}};
        int sum = 0;
        int count = 0;
        double avg = 0.0;

        for (int i = 0 ; i< array.length; i ++){
            for (int j = 0; j < array[i].length; j ++){
                sum += array[i][j];
                count++;
            }
        }

        avg = (double) sum / count;

        System.out.println("총합  :" + sum + " 평균 : " + avg);

 */


public class Remind {
    public static void main(String[] args) {


    }
}

package August.day08;

public class StringBufferEx {
    public static void main(String[] args) {
        String str = "abcdefg";

        StringBuffer sb = new StringBuffer(str);

        //StringBuffer를 String 타입으로 변환 toString()
        System.out.println("초기상태 : " + sb.toString());

        //"cd" 추출
        System.out.println("문자열 추출 : " + sb.substring(2,4));

        // 문자열에 "2" 삽입
        sb.insert(2, "추가");
        System.out.println("삽입 후 상태 : " + sb);

        // 문자열 삭제
        System.out.println("문자 삭제 : " + sb.delete(2,4));

        // 문자열 붙이기
        System.out.println("문자 붙이기 : " + sb.append("hijk"));

        //문자열 길이
        System.out.println("문자열 길이 : " + sb.length());

        //buffer 용량
        System.out.println("버퍼 용량 : " + sb.capacity());

        //역순 출력
        System.out.println("역순 출력 " + sb.reverse());

        //현상태 문자열 확인
        System.out.println("마지막 상태 확인 : " +sb);

    }
}

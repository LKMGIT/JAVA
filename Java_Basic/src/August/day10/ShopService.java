package August.day10;

public class ShopService {
    //싱글톤 패턴이란 단 하나의 유일한 객체를 만들기 위한 코드 패턴

    //메모리 절약을 위해, 인스턴스가 필요할 때 똑같은 인스턴스를 새로 만들지 않고
    // 기존의 인스턴스를 가져와 활용하는 것


    //데이터 베이스 연결 모듈을 만들 때 사용한다 (동시 접근 불가)
    //디스크 연결, 네트워크 통신, DBCP 커넥션풀, 스레드 풀, 캐시, 로그 기록 객체
    private static final ShopService instance = new ShopService();

    public static ShopService getInstance(){
        return instance;
    }

}

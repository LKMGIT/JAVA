package August.day24.rat;

//자신의 컴퓨터 IP 주소를 JAVA에서 얻어내는 방법

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = null;

        inetAddress = InetAddress.getLocalHost();
        System.out.println("나의 주소값 : " + inetAddress.getHostAddress());

    }

}

package host2ip;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Host2Ip {

	public static void main(String[] args) throws IOException {
		//String hostname = "www.daum.net";
		String hostname = "www.naver.com";

		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP 주소: " + address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(hostname + "의 IP 주소를 찾을 수 없습니다.");
		}
	}
}
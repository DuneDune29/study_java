package HttpURLTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLTest {
	public static void main(String[] args) throws Exception{
		
		HttpURLTest http = new HttpURLTest();
		
		String site = "http://www.google.com/search?q=java";
		
		URL url = new URL(site);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		//여기서 실제로 웹서버로 데이터가 전송된다.
		
		conn.setRequestMethod("GET");
		conn.setRequestProperty("user-Agent", "Mozilla/5.0");
		
		int resCode = conn.getResponseCode();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		String inputLine;
		StringBuffer output = new StringBuffer();
		
		while ((inputLine = in.readLine()) != null) {
			output.append(inputLine);
		}
		in.close();
		
		System.out.println(output);
	}
}
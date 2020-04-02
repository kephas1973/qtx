package APIHomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class RestAssured {

	@Test
	public void simpleGet() throws MalformedURLException {

		URL url = new URL("https://reqres.in/api/users");
//		URL url = new URL("https://reqres.in");
		HttpURLConnection con = null;
		try {
			con = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			con.setRequestMethod("GET");
		} catch (ProtocolException e) {
			e.printStackTrace();
		}

		//con.setRequestProperty("Content-Type", "application/json");

		try {
			int status = con.getResponseCode();
			System.out.println("status = " + status);
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String inputLine;
		StringBuffer content = new StringBuffer();
		try {
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
				content.append(inputLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(content);
		
		con.disconnect();
	}

}

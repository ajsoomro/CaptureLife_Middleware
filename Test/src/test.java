import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class test {

	public static void main(String[] args) throws IOException {
		String url = "https://arandell.royalcyber.com/wcs/resources/store/10001/loginidentity";
		Client client = Client.create();
		String logonId = "wcsadmin";
		String logonPassword = "passw0rd";
        WebResource webResource = client.resource(url);

        String input = "{\"logonId\":\""+logonId+"\",\"logonPassword\":\""+logonPassword+"\"}";
        System.out.println(input);
        
        ClientResponse conn = webResource.type("application/json").post(ClientResponse.class, input);
        
        System.out.println(conn);
        
        
        InputStream jsonIO = conn.getEntityInputStream();
		
		StringBuilder jsonBuilder = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(jsonIO));
		
		String read = br.readLine();

		while(read != null) {
			jsonBuilder.append(read);
		    read =br.readLine();
		}			
		System.out.println(jsonBuilder.toString());
	}
}

package clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.demo.entity.Emp;

public class PostJasonClient {

	public static void main(String[] args) {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:8080/EmpService/rest/emp").path("save");
		Emp entity=new Emp(122, "Narendra", "Delhi", 9876234);
		String response=target.request("text/plain").post(Entity.entity(entity, "application/json"), String.class);
		System.out.println(response);
		

	}

}

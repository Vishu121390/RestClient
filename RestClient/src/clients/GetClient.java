package clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class GetClient {

	public static void main(String[] args) {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:8080/EmpService/rest").path("emp").path("find").path("102");
		String resp=target.request(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println("Response froms server : " +resp);

	}

}

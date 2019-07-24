package clients;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.demo.entity.Emp;

public class GetJsonClientAll {

	public static void main(String[] args) {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:8080/EmpService/rest/emp").path("listAll");
		
		//String response=target.request("application/json").get(String.class);
		List<Emp> response=target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Emp>>(){});
		//System.out.println(response);
		System.out.println(response.size());
		for(Emp e: response) {
			System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getCity()+" "+e.getSalary());
		}
		
	}

}

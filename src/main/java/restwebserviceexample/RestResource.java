package restwebserviceexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/example1")
public class RestResource {
	@GET
	@Produces("text/plain")
	public String getMsg()
	{
		return "Hello";
		
	}

}

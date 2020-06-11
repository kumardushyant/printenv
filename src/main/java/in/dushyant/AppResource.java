package in.dushyant;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.vertx.core.json.JsonObject;

@Path("/app")
public class AppResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public JsonObject printEnv() {
		JsonObject obj = new JsonObject();
		System.getenv().forEach((k,v)->{
			obj.put(k, v);	
		});
		return obj;
	}

}
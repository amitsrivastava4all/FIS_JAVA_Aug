package com.srivastava.basics;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/QueryParams")
public class QueryParams {
@GET
@Path("/query")

public Response getData(@DefaultValue("Amit") @QueryParam("name") String name, 
		@DefaultValue("27") @QueryParam("age") int age
		, @DefaultValue("Shakti Nagar") @QueryParam("address") String address)
{
return Response.status(200).entity("Name is "+name+" Age is "+age+" Address is "+address).build();	
}
}

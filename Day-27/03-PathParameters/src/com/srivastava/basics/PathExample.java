package com.srivastava.basics;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
@Path("/pathParameters")
public class PathExample {
@GET
@Path("{username}")
public Response getUserName(@PathParam("username") String userName){
	return Response.status(200).entity("Welcome User "+userName).build();
}
@GET
@Path("multiplevalues/{username}/{age}/{address}")
public Response getMultipleValues(@PathParam("username") String userName, 
		@PathParam("age") int age, @PathParam("address") String address){
	return Response.status(200).entity("Welcome User "+userName+"<br> Age is "
			+ ""+age+"<br> Address is "+address).build();
}
@GET
@Path("/phoneregex/{phone : \\d+}")
public Response getPhone(@PathParam("phone") String ph){
	return Response.status(200).entity("Phone "+ph).build();
}
}

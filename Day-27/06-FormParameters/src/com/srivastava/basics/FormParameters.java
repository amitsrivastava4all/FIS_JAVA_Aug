package com.srivastava.basics;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/formparamsws")
public class FormParameters {
@POST
public Response addUserDetails(@FormParam("name") String name, 
		@FormParam("age") int age, @FormParam("address") String address){
	return Response.status(200).entity("Name "+name
			+" Age "+age+" Address "+address).build();
}
}

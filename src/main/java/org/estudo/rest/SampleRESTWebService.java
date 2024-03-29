package org.estudo.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.sun.jersey.multipart.FormDataParam;
import com.sun.jersey.spi.resource.Singleton;

@Singleton
@Path("hello")
public class SampleRESTWebService {

	@Inject
	@Named("hello.world.string")
	private String helloWorldString;
	
	@GET
	@Produces("application/json")
	public Response helloWorld(){
		return Response.ok(helloWorldString+"\n").build();
	}
	
	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public void teste(@FormDataParam("uuid") String uuid,
			          @FormDataParam("type") String type) {
		System.out.println("uuid = " + uuid);
		System.out.println("type = " + type);
	}
}

package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello(){
		String xmlResource="<? xml version='1.0' ?>" + 
				"<hello>this is sunil</hello>";
		return xmlResource;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJson(){
		return "Sunil Hello JSON";
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHtml(@QueryParam("name") String name){
		String htmlResource="<h1> Hi "+name+  "!, this is HTML</h1>";
		return htmlResource;
	}


}

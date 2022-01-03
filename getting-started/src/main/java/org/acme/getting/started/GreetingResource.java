package org.acme.getting.started;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path( "/bienvenida" )
public class GreetingResource {
 
        @Inject
        GreetingService service;

        @GET
        @Produces(MediaType.TEXT_PLAIN)
        @Path("/nombres/{name}")
        public String saludo_01( @PathParam String name) {
            return service.greeting(name);
        }
 
        @GET
        @Produces(MediaType.TEXT_PLAIN)
        public String saludo_01() {
            return "Hello JAVAMAN - 01 !!!";
        }
}      
        
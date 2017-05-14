package com.thoughtworks.api.resources;


import com.codahale.metrics.annotation.Timed;
import com.thoughtworks.api.domain.Saying;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greet")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    private final String template;

    public HelloWorldResource(String template) {
        this.template = template;
    }

    @GET
    @Timed
    public Saying greet() {
        return new Saying(1l, template);
    }

    @POST
    public Saying ungreet(Saying saying) {
        return saying;
    }

}

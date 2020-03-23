package com.kiwi.restnative;

import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/power")
public class ExampleResource {

    @PATCH
    @Path("/on")
    @Produces(MediaType.APPLICATION_JSON)
    public String turnOn() {
        return "{ status: okay }";
    }

    @PATCH
    @Path("/off")
    @Produces(MediaType.APPLICATION_JSON)
    public String turnOff() {
        return "{ status: okay }";
    }

    @GET
    @Path("/status")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "{ status: \"on | off\"  }";
    }
}
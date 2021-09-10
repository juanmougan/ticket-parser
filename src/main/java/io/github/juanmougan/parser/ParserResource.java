package io.github.juanmougan.parser;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/parser")
public class ParserResource {

    @Inject
    ParserService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public ParserResponse parse(ParserRequest request) {
        return service.parseImage(request);
    }
}

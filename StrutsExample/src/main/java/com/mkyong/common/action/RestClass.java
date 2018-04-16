package com.mkyong.common.action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/User")
public class RestClass{

    @GET
    @Path("/getUserInfo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserrDetails(@Context HttpServletRequest request,
                                    @Context HttpServletResponse response) throws JsonProcessingException {
        request.getSession().getAttribute("MyTest");
        request.getSession().setAttribute("Test2","Test2");

        TestEntity testEntity=new TestEntity();
        testEntity.setTitle((String) request.getSession().getAttribute("MyTest"));
        ObjectMapper mapper=new ObjectMapper();

        return Response.ok().status(200).entity(mapper.writeValueAsString(testEntity)).build();
    }

}
package com.example.webchatserver.utils.endpoints;

import com.example.webchatserver.ChatRoom;
import com.example.webchatserver.ChatServer;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/endpoints")
public class ActiveRooms {
    @GET
    @Path("/activeRooms")
    @Produces("application/json")
    public Response getActiveRooms() {
        //From the ChatRoom class, get the list of active rooms
        String activeRooms = ChatServer.activeChatRooms.toString();
        //build the json data for the response
        Response myResp = Response.status(200) // success
                .header("Content-Type", "application/json")
                .entity(activeRooms) // adding the json data
                .build();
        return myResp;

    }
}
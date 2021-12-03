package com.example.friendshipneverends.Controller;

import com.example.friendshipneverends.Entity.Protocol;
import org.springframework.web.bind.annotation.*;

@RestController
public class RelationshipController {

    @PostMapping("/relationship")
    public void relationship(@RequestBody String body){
        Protocol protocol = new Protocol(body);
        //Check if the destinationHost is the same as ours
        //If that's the case, create a request in the db
        //Otherwise send a request to the destinationHost with the same protocol

        switch(protocol.getMethod()){
            case "ADD":

                break;
            case "ACCEPT":

                break;
            case "DELETE":

                break;
            case "REMOVE":

                break;
            case "BLOCK":

                break;
            default:

                break;
        }
    }
}

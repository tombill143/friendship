package com.example.friendshipneverends.Controller;

import com.example.friendshipneverends.Entity.Protocol;
import org.springframework.web.bind.annotation.*;

@RestController
public class FriendshipController {

    @PostMapping("/friendship")
    public void friendship(@RequestBody String body){
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

//    ///////////////////////////
//    //      Friendships      //
//    ///////////////////////////
//    @PostMapping("/accept")
//    public void addFriend(@RequestParam String emailOne, @RequestParam String emailTwo){
//
//    }
//
//    @DeleteMapping("/remove")
//    public void removeFriend(@RequestParam String removerEmail, @RequestParam String removeeEmail){
//
//    }
//
//    ////////////////////////
//    //      Requests      //
//    ////////////////////////
//    @PostMapping("/add")
//    public void sendRequest(@RequestParam String requesterEmail, @RequestParam String requesteeEmail){
//
//    }
//
//    @DeleteMapping("/deny")
//    public void denyRequest(@RequestParam String requesterEmail, @RequestParam String requesteeEmail){
//
//    }
//
//    //////////////////////
//    //      Blocks      //
//    //////////////////////
//    @PostMapping("/block")
//    public void block(@RequestParam String blockerOne, @RequestParam String blockeeTwo){
//
//    }
//
//    /////////////////////
//    //      Users      //
//    /////////////////////
//    @GetMapping("/users")
//    public void getUsers(){
//        //Return all
//    }
}

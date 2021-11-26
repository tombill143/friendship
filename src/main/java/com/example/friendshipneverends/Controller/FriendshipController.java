package com.example.friendshipneverends.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class FriendshipController {

    ///////////////////////////
    //      Friendships      //
    ///////////////////////////
    @PostMapping("/accept")
    public void addFriend(@RequestParam String emailOne, @RequestParam String emailTwo){

    }

    @DeleteMapping("/remove")
    public void removeFriend(@RequestParam String removerEmail, @RequestParam String removeeEmail){

    }

    ////////////////////////
    //      Requests      //
    ////////////////////////
    @PostMapping("/add")
    public void sendRequest(@RequestParam String requesterEmail, @RequestParam String requesteeEmail){

    }

    @DeleteMapping("/deny")
    public void denyRequest(@RequestParam String requesterEmail, @RequestParam String requesteeEmail){

    }

    //////////////////////
    //      Blocks      //
    //////////////////////
    @PostMapping("/block")
    public void block(@RequestParam String blockerOne, @RequestParam String blockeeTwo){

    }

    /////////////////////
    //      Users      //
    /////////////////////
    @GetMapping("/users")
    public void getUsers(){
        //Return all
    }
}

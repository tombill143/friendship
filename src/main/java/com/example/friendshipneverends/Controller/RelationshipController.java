package com.example.friendshipneverends.Controller;

import com.example.friendshipneverends.Entity.Protocol;
import com.example.friendshipneverends.Service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@RestController
public class RelationshipController {

    RelationshipService relationshipService;
    @Autowired
    public RelationshipController( RelationshipService relationshipService){
       this.relationshipService = relationshipService;
    }

    private static String personalHost = System.getenv("IP_ADDRESS");

    @PostMapping( "/relationship")
    public ResponseEntity<String> postGreetingRoot(@RequestBody String body){
        System.out.println(body);


        Protocol protocol = new Protocol(body);
        System.out.println(protocol + " " + personalHost);
        //Check if the destinationHost is the same as ours
        if(protocol.getDestinationHost().equals(personalHost)){
            //If that's the case, create a request in the db
            relationshipService.manipulateRelationship(protocol);
            System.out.println("1");
            //Send a response back to the source user'
            return ResponseEntity.ok("Response");
        }
        else {
            //Otherwise send a request to the destinationHost with the same protocol
            final String REQUEST_URL = protocol.getDestinationHost() + "/relationship";
            WebClient webClient = WebClient.builder()
                    .baseUrl(REQUEST_URL)
                    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .build();

            String response = webClient.post()
                    .body(Mono.just(body), String.class)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            //When response is received, create a copy on own database
            relationshipService.manipulateRelationship(protocol);
        }
        return ResponseEntity.ok("Completed");
    }
}

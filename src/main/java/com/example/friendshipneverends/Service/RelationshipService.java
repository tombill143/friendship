package com.example.friendshipneverends.Service;

import com.example.friendshipneverends.Entity.Protocol;
import com.example.friendshipneverends.Entity.Relationship;
import com.example.friendshipneverends.Entity.User;
import com.example.friendshipneverends.Repository.RelationshipRepository;
import com.example.friendshipneverends.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationshipService {

    private final RelationshipRepository relationshipRepository;
    private final UserRepository userRepository;

    @Autowired
    public RelationshipService(RelationshipRepository relationshipRepository, UserRepository userRepository) {
        this.relationshipRepository = relationshipRepository;
        this.userRepository = userRepository;
    }

    public void manipulateRelationship(Protocol protocol){
        User source, destination;
        Relationship relationship;
        switch(protocol.getMethod()){
            case "ADD":
                source = userRepository.findByEmail(protocol.getSourceEmail());
                destination = userRepository.findByEmail(protocol.getDestinationEmail());
                relationship = new Relationship();
                break;
            case "ACCEPT":
                //relationship = relationshipRepository.findBySourceUserAndDestinationUser();
                relationship.setConnection("FRIEND");
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

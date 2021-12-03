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
        User source = userRepository.findByEmail(protocol.getSourceEmail());
        User destination = userRepository.findByEmail(protocol.getDestinationEmail());
        Relationship relationship  = relationshipRepository.findBySourceUserAndDestinationUser(source, destination);
        switch(protocol.getMethod()){
            case "ADD":
                //If there isn't another relationship between them
                if(relationship == null){
                    relationship = new Relationship(source, destination, "REQUEST");
                    relationshipRepository.save(relationship);
                }
                break;
            case "ACCEPT":
                //If their current relationship is a pending friendship
                if(relationship.getConnection().equals("REQUEST")){
                    relationship.setConnection("FRIEND");
                    relationshipRepository.save(relationship);
                }
                break;
            case "DELETE":
                //If their current relationship is a pending friendship
                if(relationship.getConnection().equals("REQUEST")){
                    relationshipRepository.delete(relationship);
                }
                break;
            case "REMOVE":
                //If the user changes their mind about the pending friendship
                if(relationship.getConnection().equals("FRIEND")){
                    relationshipRepository.delete(relationship);
                }
                break;
            case "BLOCK":

                break;
            default:

                break;
        }
    }
}

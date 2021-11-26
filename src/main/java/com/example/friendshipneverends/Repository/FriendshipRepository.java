package com.example.friendshipneverends.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Entity.Friendship;

public interface FriendshipRepository extends JpaRepository<Friendship, Integer>{
}

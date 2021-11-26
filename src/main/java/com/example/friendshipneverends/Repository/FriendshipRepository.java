package com.example.friendshipneverends.Repository;

import com.example.friendshipneverends.Entity.Friendship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendshipRepository extends JpaRepository<Friendship, Integer>{
}

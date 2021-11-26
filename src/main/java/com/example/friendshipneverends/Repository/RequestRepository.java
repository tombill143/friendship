package com.example.friendshipneverends.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Entity.Request;

public interface RequestRepository extends JpaRepository<Request, Integer>{
}

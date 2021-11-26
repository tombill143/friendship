package com.example.friendshipneverends.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Entity.Block;

public interface BlockRepository extends JpaRepository<Block, Integer> {
}

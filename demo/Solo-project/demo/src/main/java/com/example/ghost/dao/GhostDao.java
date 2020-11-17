package com.example.ghost.dao;

import com.example.ghost.entities.GhostEntity;
import org.springframework.data.repository.CrudRepository;

public interface GhostDao extends CrudRepository<GhostEntity, Long>{
    GhostEntity findByName(String name);
}

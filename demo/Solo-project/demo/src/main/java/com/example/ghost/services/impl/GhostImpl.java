package com.example.ghost.services.impl;

import com.example.ghost.dao.GhostDao;
import com.example.ghost.dto.GhostDto;
import com.example.ghost.entities.GhostEntity;
import com.example.ghost.services.Ghost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GhostImpl implements Ghost{

    @Autowired
    GhostDao ghostDao;

    @Override
    public void deleteCharacterById(Long id) {

        ghostDao.deleteById(id);
    }

    @Override
    public GhostDto createCharacter(GhostDto ghostDto) {
        GhostEntity ghostEntity=new GhostEntity();

        ghostEntity.setName(ghostDto.getName());
        ghostEntity.setBio(ghostDto.getBio());
        ghostEntity.setRole(ghostDto.getRole());
        ghostEntity.setBirth(ghostDto.getBirth());

        ghostEntity=ghostDao.save(ghostEntity);

        ghostDto.setId(ghostEntity.getId());
        return ghostDto;
    }

    @Override
    public GhostDto getByName(String name) {
        GhostEntity ghost= ghostDao.findByName(name);

        GhostDto ghostDto=new GhostDto();

        ghostDto.setId(ghost.getId());
        ghostDto.setName(ghost.getName());
        ghostDto.setBio(ghost.getBio());
        ghostDto.setBirth(ghost.getBirth());
        ghostDto.setRole(ghost.getRole());
        return ghostDto;
    }

    @Override
    public String getBio(String name) {
        GhostEntity ghost=ghostDao.findByName(name);
        return ghost.getBio();
    }

    @Override
    public GhostDto updateCharacter(Long id,GhostDto ghostDto) {

        GhostEntity ghostEntity=ghostDao.findById(id).get();

        ghostDto.setId(ghostEntity.getId());
        ghostEntity.setName(ghostDto.getName());
        ghostEntity.setBio(ghostDto.getBio());
        ghostEntity.setRole(ghostDto.getRole());
        ghostEntity.setBirth(ghostDto.getBirth());

        ghostDao.save(ghostEntity);
        return ghostDto;
    }

}

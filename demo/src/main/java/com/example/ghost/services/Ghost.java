package com.example.ghost.services;

import com.example.ghost.dto.GhostDto;



public interface Ghost {
    void deleteCharacterById(Long id);
    GhostDto createCharacter(GhostDto ghostDto);
    GhostDto getByName(String name);
    String getBio(String name);
    GhostDto updateCharacter(GhostDto ghostDto);
}

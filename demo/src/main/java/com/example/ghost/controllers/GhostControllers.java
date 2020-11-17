package com.example.ghost.controllers;

import com.example.ghost.dto.GhostDto;
import com.example.ghost.services.Ghost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value="/ghost")
public class GhostControllers {

    @Autowired
    private Ghost ghost;

    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public void deleteCharacterById(@PathVariable Long id){

        ghost.deleteCharacterById(id);}

    @RequestMapping(value="/creating",method=RequestMethod.POST)
    public GhostDto createCharacter(@RequestBody GhostDto ghostDto){return ghost.createCharacter(ghostDto);}

    @RequestMapping(value="/bio/{name}", method=RequestMethod.GET)
    public String getBio(@PathVariable String name){

        return ghost.getBio(name);}

    @RequestMapping(value="/updating",method=RequestMethod.POST)
    public GhostDto updateCharacter(@RequestBody GhostDto ghostDto){
        return ghost.updateCharacter(ghostDto);}

    @RequestMapping(value="/character/{name}", method=RequestMethod.GET)
    public GhostDto getByName(@PathVariable String name){

        return ghost.getByName(name);}
}

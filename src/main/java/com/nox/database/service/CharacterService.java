package com.nox.database.service;

import com.nox.database.dao.implementation.CharacterDAOimpl;
import com.nox.database.dao.interf.CharacterDAO;
import com.nox.database.entity.Character;

import java.util.List;

public class CharacterService {

    CharacterDAO characterDAO = new CharacterDAOimpl();

    public CharacterService(){

    }

    public Character findCharacterById(int id){
        return characterDAO.findById(id);
    }

    public void saveCharacter(Character character){
        characterDAO.save(character);
    }

    public void deleteCharacter(Character character) {
        characterDAO.delete(character);
    }

    public void updateCharacter (Character character){
        characterDAO.update(character);
    }

    public List<Character> findAllCharacters(){
        return  characterDAO.findAllCharacters();
    }

    public Character findCharacterByName( String name){
        return  characterDAO.findCharacterByName(name);
    }

    public List<Character> findCharacterByTabletop( String tabletopName){
        return  characterDAO.findCharactersByTalbetop(tabletopName);
    }

    public List<Character> findCharacterByPlayer(String playerName){
        return  characterDAO.findCharactersByPlayer(playerName);
    }

}

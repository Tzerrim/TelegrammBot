package com.nox.database.dao.interf;

import com.nox.database.entity.Tabletop;

import java.util.List;


public interface CharacterDAO {

    public void save(Character character);

    public void update(Character character);

    public void delete(Character character);

    public Character findById(int id);

    public List<Character> findAllCharacters();

    public List<Character> findCharactersByTalbetop(String tabletopName);

    public List<Character> findCharactersByPlayer(String tabletopName);
}

package com.nox.database.service;

import com.nox.database.dao.implementation.PlayerDAOimpl;
import com.nox.database.dao.interf.PlayerDAO;
import com.nox.database.entity.Player;

import java.util.List;

public class CharacterService {

    PlayerDAO playerDAO = new PlayerDAOimpl();

    public CharacterService(){

    }

    public Player findPlayerById(int id){
        return playerDAO.findById(id);
    }

    public void savePlayer(Player player){
        playerDAO.save(player);
    }

    public void deletePlayer(Player player) {
        playerDAO.delete(player);
    }

    public void updateBooks (Player player){
        playerDAO.update(player);
    }

    public List<Player> findAllPlayers(){
        return  playerDAO.findAllPlayers();
    }

    public Player findPlayerByName( String name){
        return  playerDAO.findByName(name);
    }
}

package com.nox.database.service;

import com.nox.database.dao.implementation.PlayerDAOimpl;
import com.nox.database.entity.Player;

import java.util.List;

public class PlayerService {

    PlayerDAOimpl playerDAO = new PlayerDAOimpl();

    public PlayerService(){

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
        return  playerDAO.findAll();
    }

    public Player findPlayerByName( String name){
        return  playerDAO.findByName(name);
    }
}

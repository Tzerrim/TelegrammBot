package com.nox.database.dao.api;

import com.nox.database.entity.Player;

import java.util.List;


public interface PlayerDAO {

    public void save(Player player);

    public void update(Player player);

    public void delete(Player player);

    public Player findById(int id);

    public Player findByName(String name);

    public List<Player> findAllPlayers();

}

package com.nox.database.dao.interf;

import com.nox.database.entity.Book;
import com.nox.database.entity.Player;

import java.util.List;


public interface PlayerDAO {

    public void save(Player player);

    public void update(Player player);

    public void delete(Player player);

    public Book findById(int id);

    public List<Book> findAllPlayers();

}

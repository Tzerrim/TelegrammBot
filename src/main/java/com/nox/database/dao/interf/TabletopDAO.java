package com.nox.database.dao.interf;

import com.nox.database.entity.Tabletop;

import java.util.List;


public interface TabletopDAO {

    public void save(Tabletop tabletop);

    public void update(Tabletop tabletop);

    public void delete(Tabletop tabletop);

    public Tabletop findById(int id);

    public Tabletop findByName(String name);

    public List<Tabletop> findAllTabletops();

    public Tabletop findByName(String name);
}

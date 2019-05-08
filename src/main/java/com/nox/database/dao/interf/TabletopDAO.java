package com.nox.database.dao.interf;

import com.nox.database.entity.Tabletop;

import java.util.List;


public interface TabletopDAO {

    public Tabletop findById(int id);

    public void save(Tabletop tabletop);

    public void update(Tabletop tabletop);

    public void delete(Tabletop tabletop);

    public List<Tabletop> findAllTabletops();
}

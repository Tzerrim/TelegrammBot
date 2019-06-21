package com.nox.database.service;

import com.nox.database.dao.implementation.TabletopDAOimpl;
                                           
import com.nox.database.dao.interf.TabletopDAO;
import com.nox.database.entity.Tabletop;

import java.util.List;

public class TabletopService {

    TabletopDAO TabletopDAO = new TabletopDAOimpl();

    public TabletopService(){

    }

    public Tabletop findTabletop(int id){
        return TabletopDAO.findById(id);
    }

    public void saveTabletop(Tabletop Tabletop){
        TabletopDAO.save(Tabletop);
    }

    public void deleteTabletop(Tabletop Tabletop) {
        TabletopDAO.delete(Tabletop);
    }

    public void updateTabletops (Tabletop Tabletop){
        TabletopDAO.update(Tabletop);
    }

    public List<Tabletop> findAllTabletops(){
        return  TabletopDAO.findAllTabletops();
    }

}

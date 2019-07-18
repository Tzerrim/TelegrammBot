package com.nox.database.service;

import com.nox.database.dao.implementation.HouseruleDAOimpl;
import com.nox.database.dao.implementation.PlayerDAOimpl;
import com.nox.database.dao.interf.HouseruleDAO;
import com.nox.database.dao.interf.PlayerDAO;
import com.nox.database.entity.Houserule;
import com.nox.database.entity.Player;

import java.util.List;

public class HouseruleService {

    HouseruleDAO houseruleDAO = new HouseruleDAOimpl();

    public HouseruleService(){

    }

    public Houserule findHouseruleById(int id){
        return houseruleDAO.findById(id);
    }

    public void saveHouserule(Houserule houserule){
        houseruleDAO.save(houserule);
    }

    public void deleteHouserule(Houserule houserule) {
        houseruleDAO.delete(houserule);
    }

    public void updateHouserule (Houserule houserule){
        houseruleDAO.update(houserule);
    }

    public List<Houserule> findAllHouserule(){
        return  houseruleDAO.findAllHouserules();
    }

    public List<Houserule> findHouseruleByTabletop( String tabletopName){
        return  houseruleDAO.findHouserulesByTalbetop(tabletopName);
    }

}

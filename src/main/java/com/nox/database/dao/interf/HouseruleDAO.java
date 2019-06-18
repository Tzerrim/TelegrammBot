package com.nox.database.dao.interf;

import com.nox.database.entity.Houserule;

import java.util.List;

public interface HouseruleDAO {
    public void save(Houserule houserule);

    public void update(Houserule houserule);

    public void delete(Houserule houserule);

    public Houserule findById(int id);

    public List<Houserule> findAllHouserules();

    public List<Houserule> findHouserulesByTalbetop(String tabletopName);

    }

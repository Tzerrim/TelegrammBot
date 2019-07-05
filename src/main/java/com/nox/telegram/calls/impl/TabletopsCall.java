package com.nox.telegram.calls.impl;

import com.nox.database.entity.Tabletop;
import com.nox.database.service.TabletopService;
import com.nox.telegram.calls.api.Call;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class TabletopsCall implements Call {
    private Logger logger =  LogManager.getLogger(TabletopsCall.class);
    String result = new String();

    public String getResult(String game) {
        logger.info("TabletopsCall: " + game);

        TabletopService tabletopService = new TabletopService();
        List<Tabletop> tabletops = tabletopService.findAllTabletops();
        result = tabletops.stream()
                .map( n -> n.toDataString() )
                .collect( Collectors.joining( " --- \n" ) );
        return result;
    }
}

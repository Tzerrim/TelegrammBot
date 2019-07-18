package com.nox.telegram.calls.impl;

import com.nox.database.entity.Houserule;
import com.nox.database.service.HouseruleService;
import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.utils.CommonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class HouserulesCall implements Call {
    private Logger logger = LogManager.getLogger(HouserulesCall.class);

    String result = new String();

    public String getResult(String name) {
        logger.info("Houserules: " + name);
        HouseruleService houseruleService = new HouseruleService();

        if (null == name){
            List<Houserule> houserulesList = houseruleService.findAllHouserule();
            result = houserulesList.stream()
                    .map( n -> n.getDescription() )
                    .collect( Collectors.joining( " --- \n" ) );
        }
        else {
            List<Houserule> houserulesList = houseruleService.findHouseruleByTabletop(CommonUtils.nameFormatter(name));
            result = houserulesList.stream()
                    .map(n -> n.getDescription())
                    .collect(Collectors.joining(" --- \n"));
        }
        return result;
    }
}

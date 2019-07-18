package com.nox.telegram.calls.impl;

import com.nox.database.entity.Player;
import com.nox.database.service.PlayerService;
import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.utils.CommonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class PlayersCall implements Call {
    private Logger logger = LogManager.getLogger(PlayersCall.class);

    String result = new String();

    public String getResult(String name) {
        logger.info("Player: " + name);
        PlayerService playerService = new PlayerService();

        if (null == name){
            List<Player> playerList = playerService.findAllPlayers();
            result = playerList.stream()
                    .map( n -> n.toDataString() )
                    .collect( Collectors.joining( " --- \n" ) );
        }
        else {
            Player player = playerService.findPlayerByName(CommonUtils.nameFormatter(name));
            if (player != null){
                result = player.toDataString();
            }
            else {
                result = "I can't help you. Go help yourself!";
            }
        }

        return result;
    }
}

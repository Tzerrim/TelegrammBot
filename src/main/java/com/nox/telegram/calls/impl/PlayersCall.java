package com.nox.telegram.calls.impl;

import com.nox.database.entity.Player;
import com.nox.database.service.PlayerService;
import com.nox.telegram.calls.api.Call;
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
                    .collect( Collectors.joining( " --- " ) );
        }
        else {
            String playerName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
            Player player = playerService.findPlayerByName(playerName);
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

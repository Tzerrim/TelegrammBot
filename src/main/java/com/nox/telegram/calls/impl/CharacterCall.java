package com.nox.telegram.calls.impl;

import com.nox.database.entity.Player;
import com.nox.database.entity.Tabletop;
import com.nox.database.service.CharacterService;
import com.nox.database.service.PlayerService;
import com.nox.database.service.TabletopService;
import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.utils.CommonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.nox.database.entity.Character;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterCall implements Call {
    private Logger logger =  LogManager.getLogger(CharacterCall.class);
    private CharacterService characterService = new CharacterService();
    String result = new String();

    public String getResult(String data) {
        if(null != data && !data.equals("")){
            // First in games
            // Second in players
            String formattedData =  CommonUtils.nameFormatter(data);
            TabletopService tabletopService = new TabletopService();
            Tabletop tabletop = tabletopService.findTabletopByName(formattedData);
            if (tabletop != null){
                List<Character> characters = (List<Character>) characterService.findCharacterByTabletop(tabletop.getName());
                result = characters.stream()
                        .map( n -> n.toDataString())
                        .collect( Collectors.joining( " --- \n" ) );
                return result;
            }
            else {
                PlayerService playerService = new PlayerService();
                Player player = playerService.findPlayerByName(formattedData);
                if(player != null ){
                    List<Character> characters = (List<Character>) characterService.findCharacterByPlayer(player.getName());
                    result = characters.stream()
                            .map( n -> n.toDataString() )
                            .collect( Collectors.joining( " --- \n" ) );
                    return result;
                }
            }
        }
        List<Character> characters = (List<Character>) characterService.findAllCharacters();
        result = characters.stream()
                .map( n -> n.toDataString() )
                .collect( Collectors.joining( " --- \n" ) );
        return result;
    }

}

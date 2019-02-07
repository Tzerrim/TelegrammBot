package Telegram.calls.impl;

import Telegram.calls.api.Call;
import Telegram.calls.constants.Constants;

public class Games implements Call {
    StringBuilder result = new StringBuilder();

    public String getResult(String game) {
        for (int i =0; i < Constants.GAMES.size(); i++ ){
            result.append(i+1).append(". ").append(Constants.GAMES.get(i).toUpperCase()).append("\n");
        }
        return result.toString();
    }
}

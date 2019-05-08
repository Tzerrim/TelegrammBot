package com.nox.database.entity;

public class Character {

    private int id;
    private String name;
    private String description;
    private int player_id;
    private int tabletops_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getTabletops_id() {
        return tabletops_id;
    }

    public void setTabletops_id(int tabletops_id) {
        this.tabletops_id = tabletops_id;
    }
}

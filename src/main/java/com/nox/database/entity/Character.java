package com.nox.database.entity;

import com.nox.database.enums.CharacterStatus;
import com.nox.database.enums.PlayerStatus;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id")
    private Player player;

    @Column(name = "character_status")
    @Enumerated(EnumType.STRING)
    private CharacterStatus characterStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tabletops_id")
    private Tabletop tabletop;

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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Tabletop getTabletop() {
        return tabletop;
    }

    public void setTabletop(Tabletop tabletop) {
        this.tabletop = tabletop;
    }

    public CharacterStatus getCharacterStatus() {
        return characterStatus;
    }

    public void setCharacterStatus(CharacterStatus characterStatus) {
        this.characterStatus = characterStatus;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Character entity: ").append("\n");
        sb.append("id: ").append(this.id).append("\n");
        sb.append("name: ").append(this.name).append("\n");
        sb.append("description: ").append(this.description).append("\n");
        return sb.toString();
    }

    public String toDataString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Character name:\t").append(this.name).append("\n");
        sb.append("Character description:\t").append(this.description).append("\n");
        sb.append("Character status:\t").append(this.characterStatus).append("\n");
        sb.append("Tabletop:\t").append(this.tabletop.getName()).append("\n");
        sb.append("Player:\t").append(this.player.getName()).append("\n");
        return sb.toString();
    }

}

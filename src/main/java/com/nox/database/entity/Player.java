package com.nox.database.entity;

import com.nox.database.api.entityApi;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "players")
public class Player implements entityApi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(targetEntity= Character.class, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "player_id")
    private List<Character> characters;

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

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Player entity: ").append("\n");
        sb.append("id: ").append(this.id).append("\n");
        sb.append("name: ").append(this.name).append("\n");
        sb.append("description: ").append(this.description).append("\n");
        return sb.toString();
    }

    public String toDataString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Player name:\t").append(this.name).append("\n");
        sb.append("Player description:\t").append(this.description).append("\n");

        sb.append("Player characters:\t").append(this.characters.stream()
                .map( n -> n.getName() + " ("+n.getTabletop().getName() +")")
                .collect( Collectors.joining( " , " ) )).append("\n");
        return sb.toString();
    }
}

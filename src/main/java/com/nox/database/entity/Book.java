package com.nox.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tabletops_id")
    private Tabletop tabletop;

    public Book(){}

    public Book(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

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


    public Tabletop getTabletop() {
        return tabletop;
    }

    public void setTabletop(Tabletop tabletop) {
        this.tabletop = tabletop;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Book entity: ").append("\n");
        sb.append("id: ").append(this.id).append("\n");
        sb.append("name: ").append(this.name).append("\n");
        sb.append("description: ").append(this.description).append("\n");
        return sb.toString();
    }

    public String toDataString(){
        StringBuilder sb = new StringBuilder();
        sb.append("name: ").append(this.name).append("\n");
        sb.append("description: ").append(this.description).append("\n");
        return sb.toString();
    }
}

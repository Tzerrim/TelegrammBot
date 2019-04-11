package com.nox.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tabletops_id")
    private tabletop tabletop;


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

    public com.nox.database.entity.tabletop getTabletop() {
        return tabletop;
    }

    public void setTabletop(com.nox.database.entity.tabletop tabletop) {
        this.tabletop = tabletop;
    }
}

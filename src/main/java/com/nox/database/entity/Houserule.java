package com.nox.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "houserules")
public class Houserule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tabletops_id")
    private Tabletop tabletop;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        sb.append("Houserule entity: ").append("\n");
        sb.append("id: ").append(this.id).append("\n");
        sb.append("description: ").append(this.description).append("\n");
        return sb.toString();
    }
}

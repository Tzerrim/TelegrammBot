package com.nox.database.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tabletops")
public class tabletop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "tabletop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<book> books;

    public tabletop(){}

    public tabletop(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.books = new ArrayList<book>();
    }

    public void addBook( book book){
        book.setTabletop(this);
        books.add(book);
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

    public List<book> getBooks() {
        return books;
    }

    public void setBooks(List<book> books) {
        this.books = books;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Tabletop entity: ").append("\n");
        sb.append("id: ").append(this.id).append("\n");
        sb.append("name: ").append(this.name).append("\n");
        sb.append("description: ").append(this.description).append("\n");
        return sb.toString();
    }
}

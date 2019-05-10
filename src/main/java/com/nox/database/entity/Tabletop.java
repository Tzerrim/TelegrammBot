package com.nox.database.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tabletops")
public class Tabletop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

//    private List<Book> Books;

    public Tabletop(){}

    public Tabletop(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

//    public void addBook( Book book){
//        book.setTabletop(this);
//        Books.add(book);
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

//    @OneToMany(targetEntity= Book.class, cascade = CascadeType.ALL, orphanRemoval = true)
//    public List<Book> getBooks() {
//        return Books;
//    }

//    public void setBooks(List<Book> Books) {
//        this.Books = Books;
//    }

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

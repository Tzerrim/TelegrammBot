package com.nox.database.entity;

import javax.persistence.*;
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

    @OneToMany(targetEntity= Book.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

    @OneToMany(targetEntity= Houserule.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Houserule> houserules;

    @OneToMany(targetEntity= Character.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Character> characters;

    public Tabletop(){}

    public Tabletop(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void addBook( Book book){
        book.setTabletop(this);
        books.add(book);
    }

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


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> Books) {
        this.books = Books;
    }

    public List<Houserule> getHouserules() {
        return houserules;
    }

    public void setHouserules(List<Houserule> houserules) {
        this.houserules = houserules;
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
        sb.append("Tabletop entity: ").append("\n");
        sb.append("id: ").append(this.id).append("\n");
        sb.append("name: ").append(this.name).append("\n");
        sb.append("description: ").append(this.description).append("\n");
        return sb.toString();
    }

    public String toDataString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\n");
        sb.append(this.description).append("\n");
        return sb.toString();
    }
}

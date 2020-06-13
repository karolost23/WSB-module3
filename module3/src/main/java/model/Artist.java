package com.example.module3.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String nick;
    @ManyToMany(mappedBy = "artists")

    private Set<com.example.module3.model.Song> songs = new HashSet<>();

    public Artist() {
    }

    public Artist(String firstName, String lastName, String nick) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nick = nick;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Set<com.example.module3.model.Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<com.example.module3.model.Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nick='" + nick + '\'' +
                ", songs=" + songs +
                '}';
    }
}

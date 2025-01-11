package com.jt.securenotes.models;



import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String content;

    private String ownerUsername;

    public Note() {
    }

    public Note(String content, String ownerUsername) {
        this.content = content;
        this.ownerUsername = ownerUsername;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

    @Override
    public String toString() {
        return "Note{" + "id=" + id + ", content=" + content + ", ownerUsername=" + ownerUsername + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(id, note.id) && Objects.equals(content, note.content) && Objects.equals(ownerUsername, note.ownerUsername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, ownerUsername);
    }


}

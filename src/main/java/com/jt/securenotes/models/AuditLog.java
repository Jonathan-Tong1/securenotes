package com.jt.securenotes.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String action;
    private String username;
    private Long noteId;
    private String noteContent;
    private LocalDateTime timestamp;

    // Default Constructor
    public AuditLog() {
    }

    // All-Args Constructor
    public AuditLog(Long id, String action, String username, Long noteId, String noteContent, LocalDateTime timestamp) {
        this.id = id;
        this.action = action;
        this.username = username;
        this.noteId = noteId;
        this.noteContent = noteContent;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    // toString Method
    @Override
    public String toString() {
        return "AuditLog{" +
                "id=" + id +
                ", action='" + action + '\'' +
                ", username='" + username + '\'' +
                ", noteId=" + noteId +
                ", noteContent='" + noteContent + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    // equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuditLog auditLog = (AuditLog) o;
        return Objects.equals(id, auditLog.id) &&
                Objects.equals(action, auditLog.action) &&
                Objects.equals(username, auditLog.username) &&
                Objects.equals(noteId, auditLog.noteId) &&
                Objects.equals(noteContent, auditLog.noteContent) &&
                Objects.equals(timestamp, auditLog.timestamp);
    }

    // hashCode Method
    @Override
    public int hashCode() {
        return Objects.hash(id, action, username, noteId, noteContent, timestamp);
    }
}
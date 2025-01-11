package com.jt.securenotes.services;

import com.jt.securenotes.models.AuditLog;
import com.jt.securenotes.models.Note;

import java.util.List;

public interface AuditLogService {
    void LogNoteCreation(String username, Note note);

    void LogNoteUpdate(String username, Note note);

    void LogNoteDeletion(String username, Long noteId);

    List<AuditLog> getAllAuditLogs();

    List<AuditLog> getAuditLogsForNoteId(Long id);
}

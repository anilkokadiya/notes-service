package com.notes.notesservice.service;

import com.notes.notesservice.model.Note;
import com.notes.notesservice.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl {

    @Autowired
    JdbcTemplate jdbcTemplate;

    NoteRepository noteRepository;

    public Note addNote(Note note) {
                String sql = "INSERT INTO NOTE(user_id, title, note, created_time, last_updated_time) VALUES ("
                + "12345" + ",'" + note.getTitle() + "','" + note.getNote() + "','"
                + note.getCreated_time() + "', '" + note.getLast_updated_time() + "')";
        System.out.println("INSERT QUERY : " + sql);
        int count = jdbcTemplate.update(sql);
        return note;
    }

    public int deleteNote(int noteId) {
        String sql = "DELETE FROM NOTE WHERE ID = '" + noteId + "'";
        System.out.println("DELETE QUERY : " + sql);
        int count = jdbcTemplate.update(sql);
        return noteId;
    }

    public Note updateNote(String noteId, Note note) {
        String sql = "UPDATE NOTE SET title = '" + note.getTitle() + "', note = '" + note.getNote() + "', last_updated_time = '" + note.getLast_updated_time() +
                "' WHERE id = '" + noteId + "'";
        System.out.println("UPDATE QUERY : " + sql);
        int count = jdbcTemplate.update(sql);
        return note;
    }

}

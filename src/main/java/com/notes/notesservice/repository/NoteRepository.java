package com.notes.notesservice.repository;

import com.notes.notesservice.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface NoteRepository extends JpaRepository<Note, Integer> {
}

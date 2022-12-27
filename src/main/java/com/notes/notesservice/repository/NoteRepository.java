package com.notes.notesservice.repository;

import com.notes.notesservice.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}

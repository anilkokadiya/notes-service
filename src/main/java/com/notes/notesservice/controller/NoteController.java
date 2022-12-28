package com.notes.notesservice.controller;

import com.notes.notesservice.model.Note;
import com.notes.notesservice.service.NoteServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
@CrossOrigin("http://localhost:4200")
public class NoteController {

    private final NoteServiceImpl noteServiceImpl;

    public NoteController(NoteServiceImpl noteServiceImpl) {
        this.noteServiceImpl = noteServiceImpl;
    }

    @PostMapping("/add")
    public ResponseEntity<Note> submitNote(@RequestBody Note note) {
        System.out.println("NOTE DATA AT CONTROLLER : " + note);
        Note notes = null;
        try {
            notes = noteServiceImpl.addNote(note);
        } catch (Exception e) {
            e.getMessage();
        }
        return new ResponseEntity(notes, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Note> removeNote(@PathVariable("id") int id) {
        System.out.println("NOTE ID DATA AT CONTROLLER : " + id);
        int note = 0;
        try {
            note = noteServiceImpl.deleteNote(id);
        } catch (Exception e) {
            e.getMessage();
        }
        return new ResponseEntity(note, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Note> upgradeNote(@PathVariable("id") String id, @RequestBody Note note) {
        System.out.println("NOTE ID DATA AT CONTROLLER : " + id);
        System.out.println("NOTE DATA AT CONTROLLER : " + note);
        Note updatedNote;
        try {
            updatedNote = noteServiceImpl.updateNote(id, note);
        } catch (Exception e) {
            e.getMessage();
        }
        return new ResponseEntity(note, HttpStatus.OK);
    }

}

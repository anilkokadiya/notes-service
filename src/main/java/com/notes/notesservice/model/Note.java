package com.notes.notesservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "note")
@Data
public class Note {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "note")
    private String note;

    @Column(name = "created_time")
    private String created_time;

    @Column(name = "last_updated_time")
    private String last_updated_time;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}

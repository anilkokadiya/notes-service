package com.notes.notesservice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;

    @Column(name = "email_id")
    private String email_id;

    @Column(name = "password")
    private String password;

    @Column(name = "created_time")
    @CreationTimestamp
    private Date created_time;

    @Column(name = "last_updated_time")
    @UpdateTimestamp
    private Date last_updated_time;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user_id")
    private Set<Note> notes;

}

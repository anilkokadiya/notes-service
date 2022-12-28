package com.notes.notesservice.repository;

import com.notes.notesservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "userid", path = "user-id")
public interface UserRepository extends JpaRepository<User, Integer> {
}

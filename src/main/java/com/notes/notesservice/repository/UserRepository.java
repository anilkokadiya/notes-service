package com.notes.notesservice.repository;

import com.notes.notesservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "userId", path = "user-id")
public interface UserRepository extends JpaRepository<User, Integer> {
}

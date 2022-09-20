package com.codeclan.files_and_folders.files_folders.repositories;

import com.codeclan.files_and_folders.files_folders.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

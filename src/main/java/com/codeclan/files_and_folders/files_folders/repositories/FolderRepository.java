package com.codeclan.files_and_folders.files_folders.repositories;

import com.codeclan.files_and_folders.files_folders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

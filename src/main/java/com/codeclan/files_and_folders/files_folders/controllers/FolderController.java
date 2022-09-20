package com.codeclan.files_and_folders.files_folders.controllers;

import com.codeclan.files_and_folders.files_folders.models.File;
import com.codeclan.files_and_folders.files_folders.models.Folder;
import com.codeclan.files_and_folders.files_folders.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderController {
    @Autowired
    FolderRepository folderRepo;

    @GetMapping(value="/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(folderRepo.findAll(), HttpStatus.OK);
    }
    @GetMapping(value="/folders/{id}")
    public ResponseEntity<Optional<Folder>> getFolder(@PathVariable Long id){
        return new ResponseEntity<>(folderRepo.findById(id), HttpStatus.OK);
    }
    @PostMapping(value="/folders")
    public ResponseEntity<Folder> postFolder(@RequestBody Folder folder){
        folderRepo.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }
}

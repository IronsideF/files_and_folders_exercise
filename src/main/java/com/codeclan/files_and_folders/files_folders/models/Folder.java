package com.codeclan.files_and_folders.files_folders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="folders")
public class Folder {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String title;
    @OneToMany(mappedBy = "folder")
    @JsonIgnoreProperties({"folder"})
    private List<File> files;
    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;

    public Folder() {
    }

    public Folder(String title, Person person) {
        this.title = title;
        this.files = new ArrayList<>();
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public void addFile(File file){
        this.files.add(file);
    }
}

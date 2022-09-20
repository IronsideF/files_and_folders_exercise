package com.codeclan.files_and_folders.files_folders.components;

import com.codeclan.files_and_folders.files_folders.models.File;
import com.codeclan.files_and_folders.files_folders.models.Folder;
import com.codeclan.files_and_folders.files_folders.models.Person;
import com.codeclan.files_and_folders.files_folders.repositories.FileRepository;
import com.codeclan.files_and_folders.files_folders.repositories.FolderRepository;
import com.codeclan.files_and_folders.files_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepo;
    @Autowired
    FolderRepository folderRepo;
    @Autowired
    FileRepository fileRepo;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person myPerson = new Person("Keith");
        personRepo.save(myPerson);
        Person slyPerson = new Person("Mar");
        personRepo.save(slyPerson);
        Person flyPerson = new Person("James");
        personRepo.save(flyPerson);
        Folder folder1 = new Folder("Official Work", myPerson);
        folderRepo.save(folder1);
        Folder folder2 = new Folder("Goofing", myPerson);
        folderRepo.save(folder2);
        Folder folder3 = new Folder("Pictures", slyPerson);
        folderRepo.save(folder3);
        Folder folder4 = new Folder("Downloads", flyPerson);
        folderRepo.save(folder4);
        File file1 = new File("How to code good", "txt", 1.5, folder1);
        fileRepo.save(file1);
        File file2 = new File("How to code bad", "txt", 3.7, folder2);
        fileRepo.save(file2);
        File file3 = new File("HttpCats", "png", 8.6, folder3);
        fileRepo.save(file3);
        File file4 = new File("codeclansurveillancefootage", "mp4", 120.8, folder4);
        fileRepo.save(file4);
//        myPerson.addFolder(folder1);
//        myPerson.addFolder(folder2);
//        slyPerson.addFolder(folder3);
//        flyPerson.addFolder(folder4);
//        folder1.addFile(file1);
//        folder2.addFile(file2);
//        folder3.addFile(file3);
//        folder4.addFile(file4);
    }
}

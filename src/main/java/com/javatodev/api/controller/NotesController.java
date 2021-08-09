package com.javatodev.api.controller;

import com.javatodev.api.model.Note;
import com.javatodev.api.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NotesController {

    @Autowired
    NotesRepository nRepo;

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> readNotes() {
        return new ResponseEntity<>(nRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping("/notes")
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        return new ResponseEntity<>(nRepo.save(note), HttpStatus.CREATED);
    }

}

package com.portfolio.controller;

import com.portfolio.model.ContactMessage;
import com.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "https://dragoncoder.netlify.app")
public class ContactController {

    @Autowired
    private ContactRepository contactRepo;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody ContactMessage msg) {
        contactRepo.save(msg);
        return ResponseEntity.ok("Message saved successfully!");
    }
}
package com.app.springapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/login")
    public ResponseEntity<String> getlogin() {
        return new ResponseEntity<>("login success...", HttpStatus.OK);
    }
}

package com.jerry.filterDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MemberController {
    @PostMapping
    public ResponseEntity postMember() {
        System.out.println("I'm Controller");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

package com.lfa.oauth2springbootdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok("Hello World!");
    }
}

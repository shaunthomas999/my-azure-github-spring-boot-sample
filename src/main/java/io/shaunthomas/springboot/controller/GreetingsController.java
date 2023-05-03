package io.shaunthomas.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    public ResponseEntity<String> getGreetings(final String name) {
        return ResponseEntity.ok("Hello " + name + "!");
    }
}

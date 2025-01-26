package com.spring_boot_cicd.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple REST controller for greeting messages.
 */
@RestController
public class HelloController {
    /**
     * Endpoint to get a welcome message.
     * 
     * @return A welcome string message.
     */
    @GetMapping("/welcome")
    public String getMessage() {
        return "Welcome to Tech Soft !!";
    }
}

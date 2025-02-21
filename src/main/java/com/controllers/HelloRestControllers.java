package com.controllers;

import com.model.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestControllers {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }
    @GetMapping("/q")
    public String hello2(@RequestParam String name) {
        return "Hello "+ name +" from BridgeLab";
    }
    @GetMapping("Hello/{name}")
    public String hello3(@PathVariable String name) {
        return "Hello "+ name +" from BridgeLab";
    }

    @PostMapping("/post")
    public String hello4(@RequestBody UserDTO user) {
        return "Hello "+ user.getFirstName() + " " + user.getLastName() +" from BridgeLab";

    }
}

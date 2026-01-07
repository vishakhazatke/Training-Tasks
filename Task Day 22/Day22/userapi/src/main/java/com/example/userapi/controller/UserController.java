package com.example.userapi.controller;

import com.example.userapi.dto.UserDTO;
import com.example.userapi.entity.User;
import com.example.userapi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody UserDTO dto){

        return new ResponseEntity<>(service.saveUser(dto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){

        return ResponseEntity.ok(service.getUser(id));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){

        return ResponseEntity.ok(service.getAllUsers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @Valid @RequestBody UserDTO dto){

        return ResponseEntity.ok(service.updateUser(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){

        service.deleteUser(id);
        return ResponseEntity.ok("User Deleted");
    }
}

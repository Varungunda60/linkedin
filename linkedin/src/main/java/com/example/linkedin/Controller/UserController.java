package com.example.linkedin.Controller;

import com.example.linkedin.entity.User;
import com.example.linkedin.model.WebUser;
import com.example.linkedin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> gerAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserWithId(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping(path="/user")
    public ResponseEntity<Object> addUser(@RequestBody WebUser user, UriComponentsBuilder uriComponentsBuilder){
        userService.saveUser(user);
        UriComponents uriComponents=uriComponentsBuilder.path("/user/{id}").build();
        URI location = uriComponents.toUri();
        return ResponseEntity.created(location).build();
    }
}

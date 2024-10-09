package com.example.User.controller;

import com.example.User.entity.User;
import com.example.User.exception.UserNotFoundException;
import com.example.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/creatuser")
    public User createUser(@RequestBody @Valid User user ){
        return userService.createUser(user);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/deleteUserById/{id}")
    public String deleteUserById(@PathVariable Long id){
        return userService.deleteUserById(id);
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser(@RequestBody User user,@PathVariable Long id){
        return  userService.updateUser(user,id);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleUserNotFound(UserNotFoundException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }


}

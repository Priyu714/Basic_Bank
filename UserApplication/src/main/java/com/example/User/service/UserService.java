package com.example.User.service;

import com.example.User.entity.User;
import com.example.User.exception.UserNotFoundException;
import com.example.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(()
                ->new UserNotFoundException("User "+ id +" is not present"));
    }

    public String deleteUserById(Long id) {
        if(! userRepository.existsById(id))
            throw new UserNotFoundException("User "+ id +" is not found ");
        userRepository.deleteById(id);
        return id + " is deleted by successfull";
    }

    public User updateUser(User user, Long id) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            user.setId(id);
            return userRepository.save(user);
        } else {
            throw new UserNotFoundException("invalid "+ id +" userId and userData ");
        }
    }
}

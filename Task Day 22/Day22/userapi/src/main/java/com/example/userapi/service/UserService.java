package com.example.userapi.service;

import com.example.userapi.dto.UserDTO;
import com.example.userapi.entity.User;
import com.example.userapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(UserDTO dto){

        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());

        return userRepository.save(user);
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser(Long id, UserDTO dto){

        User user = userRepository.findById(id).orElse(null);
        if(user != null){
            user.setName(dto.getName());
            user.setEmail(dto.getEmail());
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}

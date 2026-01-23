package com.example.CacheDemo.service;

import com.example.CacheDemo.entity.User;
import com.example.CacheDemo.repository.UserRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    @Cacheable(value = "users", key = "#id", unless = "#result == null")
    public User getUser(Long id){
        return repo.findById(id).orElse(null);
    }


    @CachePut(value = "users", key = "#user.id")
    public User updateUser(User user){
        return repo.save(user);
    }

    @CacheEvict(value = "users", key = "#id")
    public void deleteUser(Long id){
        repo.deleteById(id);
    }
}

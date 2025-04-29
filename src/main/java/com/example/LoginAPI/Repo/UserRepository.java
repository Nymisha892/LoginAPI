package com.example.LoginAPI.Repo;

import com.example.LoginAPI.Model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, String> {
    // You can define custom query methods here
    Users findByUsername(String username);
}
package com.example.LoginAPI.Controller;

import com.example.LoginAPI.Model.Users;
import com.example.LoginAPI.Repo.UserRepository;
import com.example.LoginAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("http://localhost:80/")
public class UserController {


    @Autowired
    @Lazy
    private UserService userService;





    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Users user) {
        String s="debugger";
        return ResponseEntity.ok(Collections.singletonMap("token",(userService.verify(user))));
    }

    // Additional endpoints (update, delete, etc.)
}

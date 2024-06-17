//package com.example.financeapp.controller;
//
//import com.example.financeapp.model.User;
//import com.example.financeapp.service.UserService;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/users")
//
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/register")
//
//    public ResponseEntity<User> registerUser(@RequestBody User user) {
//        User registeredUser = userService.registerUser(user);
//        return ResponseEntity.ok(registeredUser);
//    }
//
//    @PostMapping("/login")
//
//    public ResponseEntity<String> loginUser(@RequestParam String email, @RequestParam String password) {
//        boolean isAuthenticated = userService.authenticateUser(email, password);
//        if (isAuthenticated) {
//            return ResponseEntity.ok("Login successful");
//        } else {
//            return ResponseEntity.status(401).body("Invalid credentials");
//        }
//    }
//
//    // Additional methods for updating profile, retrieving user details, etc.
//}

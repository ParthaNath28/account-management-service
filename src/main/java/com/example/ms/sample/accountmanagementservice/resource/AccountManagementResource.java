package com.example.ms.sample.accountmanagementservice.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account/")
public class AccountManagementResource {

    @GetMapping("/health/check")
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.ok("Account Microservice is Working");
    }
}

package com.example.hotelbooking;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class adminController {
    
    private final adminRepository repository;
    public adminController(adminRepository repository){
         this.repository = repository;
    }

    @GetMapping("/admin")
    List<admin>all(){
        return repository.findAll();
    }
    @PostMapping("/admin")
    admin newAdmin (@RequestBody admin newAdmin){
        return repository.save(newAdmin);
    }
    @GetMapping("/admin/id")
    admin one (@PathVariable long id) {
        return repository.findById(id)
        .orElseThrow(()-> new adminNotFoundExceptio(id));
    }
    @DeleteMapping("/admin/{id}")
    ResponseEntity<?> deleteAdmin(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

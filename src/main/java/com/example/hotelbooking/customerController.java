package com.example.hotelbooking;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
public class customerController {
    @Autowired
    // customerService customerService;
    private final customerRepository repository;
    public customerController(customerRepository repository){
        this.repository = repository;
    }

    @GetMapping("/customer")
    List<customer>all(){
        return repository.findAll();
    }
    @PostMapping("/customer")
    customer newCustomer (@RequestBody customer newCustomer){
        return repository.save(newCustomer);
    }
    @GetMapping("/customer/id")
    customer one (@PathVariable long id) {
        return repository.findById(id)
        .orElseThrow(()-> new customerNotFoundExceptio(id));
    }
    @DeleteMapping("/customer/{id}")
    ResponseEntity<?> deleteCustomer(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    

    
}

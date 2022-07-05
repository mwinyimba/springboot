package com.example.hotelbooking;

public class adminNotFoundExceptio extends RuntimeException {
    adminNotFoundExceptio(long id){
        super("Could not find customer" + id);
    }
    
}
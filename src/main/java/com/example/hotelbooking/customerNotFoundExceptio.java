package com.example.hotelbooking;

public class customerNotFoundExceptio extends RuntimeException {
    customerNotFoundExceptio(long id){
        super("Could not find customer" + id);
    }
    
}

package com.example.hotelbooking;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
public class customerService {
@Autowired
customerRepository customerRepository;
public List<customer> getAllcustomer(){
    List<customer>customer = new ArrayList<customer>();
    customerRepository.findAll().forEach(customer > customer.add(customer));
    return customer;
}
public customer getcustomerById(int id){
    return customerRepository.findById((long) id).get();
}
public void saveOrUpdate(customer customer ){
    customerRepository.save(customer);
}
public void delete(int id){
    customerRepository.deleteById((long) id);
}
    
}


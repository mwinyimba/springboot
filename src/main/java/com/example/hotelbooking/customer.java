package com.example.hotelbooking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class customer {
    @Id
    @GeneratedValue
    private long id;
    private String first_name;
    private String last_name;
    private String address;
    private String email;
    private String phoneNo;
    private String password;
    public customer() {
    }
    public customer(long id, String first_name, String last_name, String address, String email, String phoneNo,
            String password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "customer [address=" + address + ", email=" + email + ", first_name=" + first_name + ", id=" + id
                + ", last_name=" + last_name + ", password=" + password + ", phoneNo=" + phoneNo + "]";
    }

    
    
   
    

   
   
 
}

package com.aspect;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component

public class ShoppingCart {

    public int checkOut(String name,int age){
        //Authentication && AUthorization
        //Logging
        //sanitize the data
        System.out.println("CheckOut Method from ShoppingCart Called");
        return age;
    }
    public void checkIn(){
        System.out.println("CheckedIn");
    }
}

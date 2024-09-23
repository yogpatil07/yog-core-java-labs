package com.deloitte.lab9.ex3;

@FunctionalInterface
interface Authenticator {
    boolean authenticate(String username, String password);
}

public class Lab9Ex3 {

    public static void main(String[] args) {
        Authenticator auth = (username, password) -> 
            "admin".equals(username) && "password123".equals(password); 

        System.out.println("Authentication success: " + auth.authenticate("admin", "password123"));  
        System.out.println("Authentication failed: " + auth.authenticate("admin", "wrongpassword"));
    }
}

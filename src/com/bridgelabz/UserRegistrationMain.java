package com.bridgelabz;

/**
 * purpose - To implement Regex method for User Registration
 *
 * @author Sunil
 * @version 16.0
 * @since 23/08/2021
 */
public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Registration System");
        //Creating Variable With Using Of UserRegistration Class
        UserRegistration userRegistration = new UserRegistration();
        //Here Calling FirstName Method Storing The Result In Result
        boolean firstName = userRegistration.FirstNameValidation("Zlatan");
        System.out.println(firstName);//Printing Result
        //Here Calling Validate FirstName Method Storing The Result In Result
        boolean lastName = userRegistration.FirstNameValidation("Ibrah");
        System.out.println(lastName);//Printing Result
    }

}




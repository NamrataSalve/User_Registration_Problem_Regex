package com.userregistrationvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address: ");
        String email = sc.next();
        String regex = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
        {
            System.out.println("Entered email address is valid!!!!");
        }
        else
        {
            System.out.println("Invalid email. Ensure it follows the format: abc.xyz@bl.co.in with mandatory parts and precise @ and . positions.");
        }
    }
}

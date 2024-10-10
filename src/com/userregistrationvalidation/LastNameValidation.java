package com.userregistrationvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last name: ");
        String lastName = sc.next();
        String regex = "[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches())
        {
            System.out.println("Entered last name is valid!!!!");
        }
        else
        {
            System.out.println("Enter last name is Invalid...");
            System.out.println("Please enter last name which is start with capital latter and minimum length should be 3");
        }
    }
}

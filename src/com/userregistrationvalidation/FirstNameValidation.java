package com.userregistrationvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String firstName = sc.next();
        String regex = "[A-Z]{1}[a-z]{3,5}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches())
        {
            System.out.println("Entered name is valid!!!!");
        }
        else
        {
            System.out.println("Enter name is Invalid...");
            System.out.println("Please enter name which is start with capital latter and minimum length should be 3");
        }
    }
}

package com.userregistrationvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String password = sc.next();
        String regex = "^^[A-Z](?=.*[0-9])[a-zA-Z0-9@#$%]{7,19}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
        {
            System.out.println(password+" Is valid password");
        }
        else
        {
            System.out.println(password+" Is invalid password");
        }
    }
}
package com.userregistrationvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileFormatValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number: ");
        String phNumber = sc.next();
        String regex = "(0|91)?[-\\s]?[6-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phNumber);
        if (matcher.matches())
        {
            System.out.println(phNumber+" Is valid number");
        }
        else
        {
            System.out.println(phNumber+" Is not valid number");
        }
    }
}

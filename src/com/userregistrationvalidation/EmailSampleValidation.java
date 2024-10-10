package com.userregistrationvalidation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSampleValidation {
    public static void main(String[] args) {
        ArrayList<String> emails=new ArrayList<>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");
        String regex="[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        for(int i=0;i<emails.size();i++) {
            Matcher matcher = pattern.matcher(emails.get(i));
            System.out.println(emails.get(i) + "->" + matcher.matches());
        }
    }
}

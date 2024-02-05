package com.throwException;

import java.util.Scanner;

public class Password {

    class PasswordWrongException extends RuntimeException {
        public PasswordWrongException(String msg) {
            super(msg);
        }
    }

    void m1() {
        String s = "ABCD";

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                throw new PasswordWrongException("Password should not contain digits");
            }
        }

        if (!s.equals(input)) {
            throw new PasswordWrongException("goes well");
        }
    }

    public static void main(String[] args) {
        try {
            Password p = new Password();
            p.m1();
        } catch (PasswordWrongException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("====end========");
    }
}


package com.String_Basic;

import java.util.Arrays;

/*
 10. An array contains strings of different lengths.
 e.g. { ‘I’ , ‘am’ , ‘very’ , ‘smart’ }.Write a 
program such that array will contain all strings of same length, 
output – { ‘Iam’ , ‘ver’ , ‘ysm’ , ‘art’ } 
if array does not contain sufficient characters , replace last chars by # 
e.g. { ‘I’ , ‘like’ , ‘programming’} output { ‘Ilikep’ , ‘rogram’ , ‘ming##’ }
 */


public class Stringarrage {

    public static void main(String[] args) {

      //  String a[] = { "i", "like", "programming" };
         String a[] = { "i", "am", "very","smartt" };

        String b = "";
        String c = "";
        char ch;

        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }

        int index = b.length() / a.length;

        for (int i = 0; i < b.length(); i++) {
            ch = b.charAt(i);

            if (i % index == 0 && i != 0) {
                c = c + " ";
            }
            c = c + ch;
            
            System.out.println(c);
        }

        a = c.split(" ");
        b = a[a.length - 1];
        int d = b.length() - index;

        if (d < 0) {
            int diff = index - b.length();
            for (int i = 0; i < diff; i++) {
                b += '#';
            }
            a[a.length - 1] = b;
        }

        System.out.println(Arrays.toString(a));
    }


}
package com.String_Basic;

public class Stringdemo1 {

    public static void vowelCount() {
        String s1 = "i love my india";
        
        System.out.println(s1.length());
        
        s1.contains(s1)n
        
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c + " is a vowel");
            } else if (c == ' ') {
                count++;
                continue;
            } else {
                System.out.println(c + " is NOT a vowel");
            }
        }
        System.out.println("Spaces in my string: " + count);
        System.out.println("\n---------counting index----------------");
    }

    public static void main(String[] args) {

        vowelCount();

        String s1 = "i love my india";
        for (int i = 0; i < s1.length(); i++) {
            char chh = s1.charAt(i);
            
            
            
            System.out.println(chh+" : "+s1.indexOf(chh));
        }
        
        

        System.out.println("\n------------indexOf()----------");

        int ch = s1.indexOf(97);
        int a = s1.indexOf('a');
        int b = s1.indexOf('i', 5);
        int d = s1.indexOf(105, 5);
        int e = s1.lastIndexOf('i');
        int f = s1.lastIndexOf('i', 12);
        int g = s1.lastIndexOf("india", 12);
        int h = s1.lastIndexOf("i");

        System.out.println(ch + " index According to ASCII value");
        System.out.println(a + " index");
        System.out.println(b + " Two index parameter");
        System.out.println(d + " ASCII value of 'i' is 105");
        System.out.println(e + " last index of 'i'");
        System.out.println(f + " last index of 'i' before position 12");
        System.out.println(g + " last index of 'india' before position 12");
        System.out.println(h + " last index of 'i' before the end");

        System.out.println("\n--------toUpperCase()---------------");

        String s3 = s1.toUpperCase();
        System.out.println(s3);

        System.out.println("\n--------toLowerCase()------------");
        String s4 = s3.toLowerCase();
        System.out.println(s4);

        System.out.println("\n--------concat()--------------------");
        String s5 = s3.concat(s4);
        System.out.println(s5);

        System.out.println("\n--------length()--------------\n");
        int s6 = s5.length();
        System.out.println("Length of String: " + s6);

        System.out.println("------------------------------------");
    }
}

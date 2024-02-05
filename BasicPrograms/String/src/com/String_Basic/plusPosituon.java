package com.String_Basic;

//move alphabet to kth locaqtion 


public class plusPosituon {

	 public static void main(String[] args) {
	        String res = "";
	        int k = 2;
	      //  String s = "-/bcdefghijklmnopqrstuvwxyz";
	        String s="middle-Outz";

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            if (ch >= 'a' && ch <= 'z') {
	                char shiftedChar = (char) (ch + k);
	                if (shiftedChar > 'z') {
	                    shiftedChar = (char) ('a' + (+ - 'z' - 1));
	                }
	                res += shiftedChar;
	            } else if (ch >= 'A' && ch <= 'Z') {
	                char shiftedChar = (char) (ch + k);
	                if (shiftedChar > 'Z') {
	                    shiftedChar = (char) ('A' + (shiftedChar - 'Z' - 1));
	                }
	                res += shiftedChar;
	            } else {
	                res += ch;
	            }
	        }
	        System.out.println(res);
	    }
	}
package com.String_Basic;

public class mutableString {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StringBuffer sb = new StringBuffer();
			sb.append("hello");
			System.out.println("capacity of string buffer: " + sb.capacity());
			sb.append("welcome to my world");
			System.out.println("capacity of string buffer: " + sb.capacity());
			sb.delete(3, 5);
			System.out.println("Updated String after delete: " + sb);
			sb.insert(2, "hey ");
			System.out.println("Updated String after insert: " + sb);
			sb.reverse();
			System.out.println("Updated String after reverse: " + sb);
			
			
			String s1=new String(sb);
			System.out.println(s1);
		}

	}
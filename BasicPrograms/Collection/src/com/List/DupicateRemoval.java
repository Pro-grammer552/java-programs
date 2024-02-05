package com.List;

import java.util.ArrayList;

/*
 * Create arraylist of characters.
Remove duplicate characters from the list. E.g.
 list - { 'd', 'g', 'h', 'd 'd'. 'h', 'g'Output should be {'d', I,'g', 'h'}
 */

public class DupicateRemoval {

	
	 public static void main(String[] args) {
	 ArrayList<Character> charList = new ArrayList<>();
     charList.add('d');
     charList.add('d');
     charList.add('g');
     charList.add('g');
     charList.add('h');
     charList.add('a');
     charList.add('a');
     
     
     
     System.out.println(charList);
     
     
     
     for(int i=0;i<charList.size();i++)
     {
    	 for(int j=0;j<charList.size();j++)
    	 {
    		 if(charList.get(i).equals(charList.get(j)))
    		 {
    			 charList.remove(j);
    			 
    			 
    		 }else if(i!=j)
    		 {
    			continue;
    			 //System.out.println(charList.get(j));
    		 }
    			 
    	
    			
    			
    	 }
    	 System.out.println(charList.get(i));
     }
     System.out.println(charList);
	
}
}
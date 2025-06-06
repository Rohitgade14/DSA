package com.strings;

import java.util.Scanner;

public class CheckVowelsOrConstant {

	public static void main(String[] args) {
		
		    String  str="rohit";
		    char [] c = str.toCharArray();
		    for(int i=0;i<str.length();i++) {
		    	  
		    	   if(c[i]=='a' ||c[i]=='e' ||c[i]=='i'|| c[i]=='o'|| c[i]=='u') {
		    		   System.out.println(c[i]+" vowels");
		    	   }
		    	   else {
		    		   System.out.println(c[i]+" constant");
		    	   }
		     
		    }
	}
}

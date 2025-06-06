package com.strings;

public class PalldromeString {
	public static void main(String[] args) {
		String str="nayan";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		 if(rev.equals(str)) {
			 System.out.println("pallndrome");
		 }
		 else {
			 System.out.println("not a pallndrome");
		 }
	}

}

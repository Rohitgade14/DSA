package com.object;

public class Test {
	
public static void main(String[] args) {
     String name1="java";
     System.out.println(name1.hashCode());
     String name2="java";
     System.out.println(name1==name2);
     
     System.out.println(name2.hashCode());
     
     
       String name3= new String("java");
       System.out.println(name3.hashCode());
       System.out.println(name1==name3);
       
	
}

}



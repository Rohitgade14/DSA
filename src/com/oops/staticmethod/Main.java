package com.oops.staticmethod;

class Animal {
	 public static void makeSound() {
	        System.out.println("Generic animal sound");
	    }
}

class Dog extends Animal {
	
	public static void makeSound() {
        System.out.println("woof");
    }
	
}
public class Main {
	public static void main(String[] args) {
		
		
		Animal animal = new Animal();
		animal.makeSound();
		
		Animal animal2 = new Dog();
		animal2.makeSound();
		
		Dog dog = new Dog();
		dog.makeSound();
		
		
		
	}
	
	
}

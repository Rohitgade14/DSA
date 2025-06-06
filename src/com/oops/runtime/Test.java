package com.oops.runtime;

class Animal {
	  void makeSound() {
	        System.out.println("Animal makes a sound");
	    }
	  
}
class Dog extends Animal{
	
	void makeSound() {
		System.out.println("dog make sound");
	}
}
public class Test {
	
	public static void main(String[] args) {
		Animal animal = new  Animal();
		animal.makeSound();
		//Dog dog2 =(Dog) animal;
		//dog2.makeSound(); // get class cast exception
		
		Animal animal2 = new Dog();
		animal2.makeSound();
		
		Dog dog1 =(Dog) animal2;
		dog1.makeSound();
		
		Dog dog = new Dog();
		dog.makeSound();
		
	}

}

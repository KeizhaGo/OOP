/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zms;

/**
 *
 * @author PRO
 */
public class Bird extends Animal implements Flyable {
  
	public Bird(String name, int age, double weight) {
		super(name, age, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	void makeSound() {
		System.out.println( "is making sound Tweet tweetttt!!");
		
	}

	@Override
	void eat() {
		System.out.println("is eating seeds!");
		
	}

	@Override
	void sleep() {
		System.out.println("is sleeping");
		
	}

	public void fly() {
		System.out.println("is flying");
		
	}

   

}

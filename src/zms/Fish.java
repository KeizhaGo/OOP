/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zms;

/**
 *
 * @author PRO
 */
public class Fish extends Animal implements Swimmable {
    
	public Fish(String name, int age, double weight) {
		super(name, age, weight);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	void makeSound() {
		System.out.println("is making sound blub blubbb!");
		
	}

	@Override
	void eat() {
		System.out.println("is eating insect larvae");
		
	}

	@Override
	void sleep() {
		System.out.println("is just resting!");
		
	}

	@Override
	public void swim() {
		System.out.println("is swimming ");
		
	}

}

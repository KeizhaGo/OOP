/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zms;

/**
 *
 * @author PRO
 */
public class Mammal extends Animal {
    
    public Mammal(String name, int age, double weight) {
         super(name, age, weight);
    }
    @Override
    public void eat() {
        System.out.println("mamals now eating");
    }

    @Override
    public void sleep() {
        System.out.println("dey sleep now");
    }
    @Override
    public void makeSound() {
        System.out.println("mamals do be making sounds");
    }
  
}
class PRIMATE extends Mammal {
    
    public PRIMATE(String name, int age, double weight) {
        super(name, age, weight);
    }
    
}

class MONKEY extends PRIMATE implements Climber{

    public MONKEY(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    public void climb() {
        
    }
}

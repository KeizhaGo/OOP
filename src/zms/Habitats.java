/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRO
 */
public abstract class Habitats {
    
    List<Animal> inhabitants;

    public Habitats() {
        inhabitants = new ArrayList<>();
    }

  
    public void addAnimal(Animal anm) {
        inhabitants.add(anm);
    }

    
    public abstract void simulateInteractions();
}


class Aviary extends Habitats {
    @Override
    public void simulateInteractions() {
        for (Animal anm : inhabitants) {
            anm.makeSound();
            if (anm instanceof Flyable flyable) {
                flyable.fly();
            }
            anm.eat();
            anm.sleep();
        }
    }

    void feedanimals() {
    }
}

// Aquarium habitat for fish
class Aquarium extends Habitats {
    @Override
    public void simulateInteractions() {
        for (Animal anm : inhabitants) {
            anm.makeSound();
            if (anm instanceof Swimmable swimmable) {
                swimmable.swim();
            }
            anm.eat();
            anm.sleep();
        }
    }

    void feedanimals() {
    }
}

// Savannah habitat for mammals
class Savannah extends Habitats {
    @Override
    public void simulateInteractions() {
        for (Animal anm : inhabitants) {
            anm.makeSound();
            anm.eat();
            anm.sleep();
        }
    }

    void feedanimals() {
    }
}

// Jungle habitat for primates
class Jungle extends Habitats{
    @Override
    public void simulateInteractions() {
        for (Animal anm: inhabitants) {
            anm.makeSound();
            if (anm instanceof Climber climber) {
                climber.climb();
            }
           anm.eat();
           anm.sleep();
        }
    }
}

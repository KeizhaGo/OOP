
package zms;

import java.util.ArrayList;
import java.util.Scanner;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Climber{
    void climb();
}
public class ZMS {

    public static void main(String[] args) {
      
        ArrayList<Animal> animals = new ArrayList<>();
        Aviary aviary = new Aviary();
        Aquarium aquarium = new Aquarium();
        Savannah savannah = new Savannah();
        Jungle jungle = new Jungle();
        Scanner input = new Scanner(System.in);

        while (true) {//options for the user
            System.out.println("\n**==== Zoo Managing System ====**");
            System.out.println("1. Add Animal");
            System.out.println("2. See all Animals");
            System.out.println("3. See animals in habitat");
            System.out.println("4. Feedanimals");
            System.out.println("5. Simulate behavior ofanimals");
            System.out.println("6. Exit");
            System.out.print("Enter the desired choice: ");

            int choice = input.nextInt();
            input.nextLine(); 
            switch (choice) {//codes for the choices
                case 1 -> {
                    System.out.print("Enter the only the number of animal type you want to add (1.Mammal/2.Fish/3.Bird): ");
                    int type = input.nextInt();
                    input.nextLine();
                    System.out.print("Give it a name:");
                    String name = input.nextLine();
                    System.out.print("Enter age:");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter weight:");
                    double weight = input.nextDouble();
                    input.nextLine();
                    Animal animal;
                    switch (type) {//codes for creating the animal preferred by da user
                        case 1 -> {
                            animal = new Mammal(name, age, weight);
                            savannah.addAnimal(animal);
                    }
                        case 2 -> {
                            animal = new Fish(name, age, weight);
                            aquarium.addAnimal(animal);
                    }
                        case 3 -> {
                            animal = new Bird(name, age, weight);
                            aviary.addAnimal(animal);
                    }
                        default -> {
                            System.out.println("Invalid animal type.");
                            continue;
                    }
                    }
                //codes for creating the animal preferred by da user
                    animals.add(animal);
                    System.out.println("Animal added successfully.");
                }
                case 2 -> {
                    System.out.println("\n<<<< All Animals in the Zoo >>>>");
                    for (Animal a : animals) {
                        System.out.println(a);
                    }
                }
                case 3 -> {
                    System.out.println("\n<<<< Animals in Specific Habitats >>>>");
                    System.out.println("BirdPlace:");
                    aviary.simulateInteractions();
                    System.out.println("\nAquarium:");
                    aquarium.simulateInteractions();
                    System.out.println("\nMamalHabitat:");
                    savannah.simulateInteractions();
                }
                case 4 -> {
                    System.out.println("\n<<<< Feeding Animals >>>>");
                    System.out.println("Feeding birds in the BirdPlace...");
                    aviary.feedanimals();
                    System.out.println("Feeding fish in the Aquarium...");
                    aquarium.feedanimals();
                    System.out.println("Feeding mammals in the MamalHabitat..");
                    savannah.feedanimals();
                    System.out.println("All animals fed.");
                }
                case 5 -> {
                    System.out.println("\n==== Simulating Animal Behavior ====");
                    System.out.println("Simulating bird behavior in the BirdPlace...");
                    aviary.simulateInteractions();
                    System.out.println("Simulating fish behavior in the Aquarium...");
                    aquarium.simulateInteractions();
                    System.out.println("Simulating mammal behavior in the MamalHabitat...");
                    savannah.simulateInteractions();
                }
                case 6 -> {
                    System.out.println("CLOSING THE ZOO MANAGEMENT NOW.");
                    input.close();
                    return;
                }
                default -> System.out.println("input invalid. Please try again.");
            }
            //codes for the choices
                    }
    }
 }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.pkg1_partthree;

import java.util.ArrayList;
import java.util.Scanner;

public class Pet_Store {

    private ArrayList<Animals> animalList;

    public Pet_Store() {
        animalList = new ArrayList<>();
    }

    public void addPet(Animals animal) {  
        animalList.add(animal);
    }

    public int getNumberOfPets() {
        return animalList.size();
    }

    public void displayPetReport() {        
        System.out.println("****************************************************");
        System.out.println("Pet Shop Creatures Report:");
    
        if (animalList.isEmpty()) {
            System.out.println("No animals in store.");
        } else {
            for (Animals animal : animalList) {  
                System.out.println(animal.displayInfo());
                System.out.println("*********************************************");
            }
        }
    }

    // Method that searches for the pet:
    public Animals findPetByName(String name) {
        for (Animals animal : animalList) {  
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }

    // Method for user interaction:
    public void searchPet() {
        Scanner jn = new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.print("Please enter Name you want to search: ");
        String searchName = jn.nextLine();
        Animals animal = findPetByName(searchName);
        if (animal != null) {
            System.out.println("*********************************************");
            System.out.println(animal.displayInfo());
        } else {
            System.out.println("There is no animal by that name.");
        }
    }
}
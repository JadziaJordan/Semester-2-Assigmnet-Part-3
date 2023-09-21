/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2.pkg1_partthree;

import java.util.Scanner;

//NOTES: put breed/species in animal , method for main 
/**
 *
 * @author Jadzia Jordan
 */
public class Assignment21_PartThree {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
      
        
Scanner jn = new Scanner(System.in);
Pet_Store store = new Pet_Store(); // constructor 
int choice = 0;// allows for a loop of the menu
        
System.out.println("Welcome to the Fuzzy Prints Pet Management System!"); // HEading 
   
while (choice != 4) {// while loop allws for looping of the menu  
            System.out.println("****************************************************");
            System.out.println("Please Select an Option ");
            System.out.println("1. Add an Animal");
            System.out.println("2. Display Animals Report");
            System.out.println("3. Search Animal by Name");
            System.out.println("4. Exit");
            System.out.println("****************************************************");
            choice = jn.nextInt();
            
            jn.nextLine();// COnsume a new line 
            
            switch (choice) {
                case 1: animalChoice(store); break;  // Pass the store object to the method makes for clearner code 
                case 2: store.displayPetReport(); break; // Displays the report and pulls from  the student class
                case 3: store.searchPet();break;// Allows to search the array 
                case 4: System.out.println("Exiting "); return; // return  instead of break stops the program 
                default:
                    System.out.println("Invalid choice. Please try again.");// if a defual number is entered it loops back to the menu 
            }
        }
    }

    public static void animalChoice(Pet_Store store) {  // Accept Pet_Store as a parameter
       
        Scanner jj = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("Please Select an Animal ");
        System.out.println("1. Add Dog");
        System.out.println("2. Add Cat");
        System.out.println("3. Add Fish");
        System.out.println("4. Add Reptile");
        System.out.println("****************************************************");
        int choice = jj.nextInt();
        jj.nextLine();   // Consume newline

            switch (choice) {
                case 1:
                     System.out.println("****************************************************");
                    System.out.println("Enter Dog details:");
                    System.out.print("Name: ");
                    String dogName = jj.nextLine();
                    System.out.print("Age: ");
                    int dogAge = jj.nextInt();
                    System.out.print("Number of feeds per day: ");
                    int dogFeeds = jj.nextInt();
                    jj.nextLine(); 
                    System.out.print("Food: ");
                    String dogFood = jj.nextLine();
                    System.out.print("Breed: ");
                    String dogBreed = jj.nextLine();
                    System.out.print("House Trained (Yes/No): ");
                    
                    String dogTrained = jj.nextLine(); 
                    System.out.print("Gender: "); //asks a question for better layout options 
                    String dogGender = jj.nextLine();

                    Dog dog = new Dog(dogName, dogAge, dogFeeds, dogFood, dogBreed, dogTrained, dogGender); // added to the correct method in the class
                    store.addPet(dog);// saved to the array 
                    break;

                case 2:
                    System.out.println("*********************************************");
                    System.out.println("Enter Cat details:");
                    System.out.print("Name: ");
                    String catName = jj.nextLine();
                    System.out.print("Age: ");
                    int catAge = jj.nextInt();
                    System.out.print("Number of feeds per day: ");
                    int catFeeds = jj.nextInt();
                    jj.nextLine(); 
                    System.out.print("Food: ");
                    String catFood = jj.nextLine();
                    System.out.print("Breed: ");
                    String catBreed = jj.nextLine();
                    System.out.print("Does the cat have fur (Yes/No): ");
                    String catFur = jj.nextLine(); 
                    System.out.print("Gender: ");
                    String catGender = jj.nextLine();
                  
                    Cat cat = new Cat(catName, catAge, catFeeds, catFood, catBreed, catFur, catGender);
                    store.addPet(cat);// saved to the array 
                    break; 

          case 3:
                    System.out.println("*********************************************");
                    System.out.println("Enter Fish details:");
                    System.out.print("Name: ");
                    String fishName = jj.nextLine();
                    System.out.print("Age: ");
                    int fishAge = jj.nextInt();
                    System.out.print("Number of feeds per day: ");
                    int fishFeeds = jj.nextInt();
                    jj.nextLine(); 
                    System.out.print("Food: ");
                    String fishFood = jj.nextLine();
                    System.out.print("Species: ");
                    String fishSpecies = jj.nextLine();
                    System.out.print("Salt water or Fresh Water fish: ");
                    String fishWater = jj.nextLine();
                  
                    System.out.print("Colour: ");
                    String fishColour = jj.nextLine();
                  
                    Fish fish = new Fish(fishName, fishAge, fishFeeds, fishFood, fishSpecies, fishWater, fishColour);
                    store.addPet(fish); //saved to the array 
                    break; 

        case 4:
                    System.out.println("*********************************************");
                    System.out.println("Enter Reptiles details:");
                    System.out.print("Name: ");
                    String reptileName = jj.nextLine();
                    System.out.print("Age: ");
                    int reptileAge = jj.nextInt();
                    System.out.print("Number of feeds per day: ");
                    int reptileFeeds = jj.nextInt();
                    jj.nextLine(); 
                    System.out.print("Food: ");
                    String reptileFood = jj.nextLine();
                    System.out.print("Species: ");
                    String reptileSpecies = jj.nextLine();
                    System.out.print("Living Conditons: ");
                    String reptileConditions = jj.nextLine();
               
                    System.out.print("Venoumous or Nonevenomous: ");
                    String reptileVenoumous = jj.nextLine();
                  
                    Reptile reptile = new Reptile(reptileName, reptileAge, reptileFeeds, reptileFood, reptileSpecies, reptileConditions, reptileVenoumous );
                    store.addPet(reptile);// savved to the array 
                    break; 

             

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
// Notes to self 
// fix layout 
// search feature 
//display doesnt work 
//not showing anything 
 


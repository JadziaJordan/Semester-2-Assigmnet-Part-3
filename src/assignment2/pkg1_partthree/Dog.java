/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.pkg1_partthree;

/**
 *
 * @author Jadzia Jordan
 */
public class Dog extends Animals {
    
     private String dog_breed ;
     private String  house_trained;
     private String dog_gender;
     //child class
    
    
    public Dog(String name, int age,int number_of_feeds,String food,String dog_breed,String house_trained,String gender) {
        super(name, age, food,number_of_feeds);
        this.dog_breed = dog_breed;
        this.house_trained= house_trained;
        this.dog_gender= gender;
       //gets bree, house trained info and gender 
        
    }

    public String getDog_breed() { //getters
        return dog_breed;
    }

    public String isHouse_trained() {
        return house_trained;
    }

    public String getDog_gender() {
        return dog_gender;
    }

     @Override
    public String displayInfo() { // overridden parent class and displays this specifically for the dog 
        return super.displayInfo() + "\nBreed: " + dog_breed+ "\nHouse Trained: " + house_trained+ "\nGender: " + dog_gender;
    }
}

          
    
  
        
    

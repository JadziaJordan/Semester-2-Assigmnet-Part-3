/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.pkg1_partthree;

/**
 *
 * @author Jadzia Jordan
 */
// this is the parent class 
public class Animals {
   
// this class holds common variables for all animal saves 
    //
    private String name;
    private int age;
    private String food;
    private int number_of_feeds;
    
public Animals(String name, int age, String food,int number_of_feeds) { // sets the name, age,food and number of feeds
        this.name = name;
        this.age = age;
        this.food = food;
        this.number_of_feeds = number_of_feeds;
    }

    

    public String getName() { // getters 
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFood() {
        return food;
    }

    public int getNumber_of_feeds() {
        return number_of_feeds;
    }
      
      
  public String displayInfo() { // this the display info 
      
    
        return "Name: " + name + "\nAge: " + age + "\nFood: " + food + "\nNumber of feeds per day: " + number_of_feeds;

  }
          
}

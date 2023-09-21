/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.pkg1_partthree;

/**
 *
 * @author Jadzia Jordan
 */
public class Fish extends Animals {
    
     private String  fish_species ;  //species
     private String  water_type;
     private String colour;
    
    
    public Fish(String name, int age,int number_of_feeds,String food,String fish_species,String water_type,String colour) {
        super(name, age, food,number_of_feeds);
        this.fish_species = fish_species;
        this.water_type= water_type;
        this.colour= colour;
     }

    public String getFish_species() {
        return fish_species;
    }

    
    public String getWater_type() {
        return water_type;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nSpecies: " + fish_species+ "\nWater type: " + water_type+ "\nColour: " + colour;
    }
    
}

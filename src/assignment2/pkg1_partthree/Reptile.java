/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.pkg1_partthree;

/**
 *
 * @author Jadzia Jordan
 */
public class Reptile extends Animals{
    
    
    private String reptile_species ;
     private String  habitat_description;
     private String posinous;
    
    
    public Reptile(String name, int age,int number_of_feeds,String food,String reptile_species,String habtat_description,String posinous) {
        super(name, age, food,number_of_feeds);
        this.reptile_species = reptile_species;
        this.habitat_description= habitat_description;
        this.posinous= posinous;
     }

    public String getReptile_species() {
        return reptile_species;
    }

    public String getHabitat_description() {
        return habitat_description;
    }

    public String isPosinous() {
        return posinous;
    }
    
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nSpecies: " + reptile_species+ "\nHabitat Description: " + habitat_description+ "\nPosinous: " + posinous;
    }
}

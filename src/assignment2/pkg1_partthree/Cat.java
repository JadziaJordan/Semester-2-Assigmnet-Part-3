/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.pkg1_partthree;

/**
 *
 * @author Jadzia Jordan
 */
public class Cat extends Animals{
    
    //child class 
     private String cat_breed ;
     private String  fur;
     private String cat_gender;
    
    
    public Cat(String name, int age,int number_of_feeds,String food,String cat_breed,String fur,String cat_gender) {
        super(name, age, food,number_of_feeds);
        this.cat_breed = cat_breed;
        this.fur= fur;
        this.cat_gender= cat_gender;// sets the breed,fur,and gender
     }

    public String getCat_breed() {
        return cat_breed;
    }

    public String getFur() {
        return fur;
    }

  

    public String getCat_gender() {
        return cat_gender;
    }

      @Override
    public String displayInfo() { // overide feature that will diplay for a cat 
        return super.displayInfo() + "\nBreed: " + cat_breed+ "\nFur: " + fur+ "\nGender: " + cat_gender;
    }
    
}

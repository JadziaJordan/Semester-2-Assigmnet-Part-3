/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignment2.pkg1_partthree;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pet_StoreTest {

    private Pet_Store store;

    @Before
    public void setUp() {
        store = new Pet_Store();
    }

    @Test
    public void testAddPet() {
        Dog dog = new Dog("Buddy", 5, 2, "Kibble", "Labrador", "Yes", "Male");
        store.addPet(dog);
        assertEquals(1, store.getNumberOfPets()); 
    }

    @Test
    public void testFindPetByNameFound() {
        Dog dog = new Dog("Buddy", 5, 2, "Kibble", "Labrador", "Yes", "Male");
        store.addPet(dog);
        assertNotNull(store.findPetByName("Buddy"));
        assertEquals("Buddy", store.findPetByName("Buddy").getName());
    }

    @Test
    public void testFindPetByNameNotFound() {
        assertNull(store.findPetByName("Charlie"));
    }

    @Test
    public void testDisplayPetReportWithPets() {
        Dog dog = new Dog("Buddy", 5, 2, "Kibble", "Labrador", "Yes", "Male");
        store.addPet(dog);
        // This method is hard to test without capturing the console output. 
        // So, we're just ensuring it doesn't throw any errors.
        store.displayPetReport();
    }

    @Test
    public void testDisplayPetReportWithoutPets() {
        // Similar to the above test, but without adding any pets.
        store.displayPetReport();
    }
}
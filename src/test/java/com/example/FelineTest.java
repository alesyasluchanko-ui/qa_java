package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FelineTest {

    @Test
    public void testEatMeatReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void testGetFamilyReturnsCorrectValue() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensWithoutArgsReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithArgsReturnsPassedValue() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void testAnimalGetFoodHerbivore() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Трава", "Различные растения");
        assertEquals(expectedFood, feline.getFood("Травоядное"));
    }

    @Test
    public void testAnimalGetFoodThrowsException() {
        Feline feline = new Feline();
        assertThrows(Exception.class, () -> feline.getFood("Всеядное"));
    }
}


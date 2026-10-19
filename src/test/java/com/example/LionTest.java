package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void testGetKittensReturnsCorrectValue() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFoodReturnsPredatorFood() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(predatorFood);
        assertEquals(predatorFood, lion.getFood());
    }

    @Test(expected = Exception.class)
    public void testConstructorThrowsExceptionOnInvalidSex() throws Exception {
        new Lion(feline, "Неизвестно");
    }
}


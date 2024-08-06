package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CatTests {

    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void getSound_IsCorrect() {
        String expectedString = "Мяу";
        assertEquals(
                expectedString,
                new Cat(feline).getSound()
        );
    }

    @Test
    public void getFood_IsCorrect() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedListOfFood = List.of("Мясо");
        Mockito.when(feline.eatMeat()).thenReturn(expectedListOfFood);

        assertEquals(
                expectedListOfFood,
                cat.getFood()
        );
    }
}

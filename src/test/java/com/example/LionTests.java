package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class LionTests {
    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void createLion_ExpectedException() {
        assertThrows(Exception.class, () -> new Lion(feline, "Не определено"));
    }

    @Test
    public void getKittens_IsCorrect() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        int expectedCount = 5;
        Mockito.when(feline.getKittens()).thenReturn(expectedCount);

        assertEquals(
                expectedCount,
                lion.getKittens()
        );
    }

    @Test
    public void getFood_IsCorrect() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expectedListOfFood = List.of("Пища");
        Mockito.when(feline.eatMeat()).thenReturn(expectedListOfFood);

        assertEquals(
                expectedListOfFood,
                lion.getFood()
        );
    }
}

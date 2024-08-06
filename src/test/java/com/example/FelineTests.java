package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTests {

    @Test
    public void getFamily_IsCorrect() {
        String expectedFelineFamilyName = "Кошачьи";

        assertEquals(
                expectedFelineFamilyName,
                new Feline().getFamily()
        );
    }

    @Test
    public void getKittens_InputCountIsCorrect() {
        int expectedCount = 5;

        assertEquals(
                expectedCount,
                new Feline().getKittens(expectedCount)
        );
    }

    @Test
    public void getKittens_DefaultIsCorrect() {
        int expectedCount = 1;

        assertEquals(
                expectedCount,
                new Feline().getKittens()
        );
    }

    @Test
    public void eatMeatIsCorrect() throws Exception {
        Feline feline = new Feline();

        assertEquals(
                feline.getFood("Хищник"),
                List.of("Животные", "Птицы", "Рыбы")
        );
    }
}

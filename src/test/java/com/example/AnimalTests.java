package com.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AnimalTests {

    @Test
    public void getFamily_FamilyIsCorrect() {
        String expectedString = "Существует несколько семейств жювотных: медвежьи, псовые, кошачьи, куньи, заячьи, беличьи, мышиные";

        assertEquals(
                expectedString,
                new Animal().getFamily()
        );
    }

    @Test
    public void getFood_ExpectedException() {
        assertThrows(Exception.class, () -> new Animal().getFood(""));
    }
}

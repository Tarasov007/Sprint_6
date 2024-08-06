package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LionAlexTests {

    @Mock
    Feline feline;

    @Test
    public void getKittens_ExpectedZero() throws Exception {
        assertEquals(
                0,
                new LionAlex(feline).getKittens()
        );
    }

    @Test
    public void getPlaceOfLiving_IsCorrect() throws Exception {
        assertEquals(
                "Нью-Йоркский зоопарк",
                new LionAlex(feline).getPlaceOfLiving()
        );
    }

    @Test
    public void getFriends_IsCorrect() throws Exception {
        List<String> expectedList = List.of(
                "Зебра Марти",
                "Бегемотиха Глория",
                "Жираф Мелман"
        );
        assertEquals(
                expectedList,
                new LionAlex(feline).getFriends()
        );
    }
}

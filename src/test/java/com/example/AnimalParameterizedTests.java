package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalParameterizedTests {
    @ParameterizedTest(name = "Класс Animal. Тип животного: {0}")
    @CsvSource({
            "Хищник, Животные; Птицы; Рыбы",
            "Травоядное, Трава; Разные растения"
    })
    @DisplayName("Проверка типа питания")
    public void getFood_FoodIsCorrect(String animalKind, String expectedFoodStr) throws Exception {
        var expectedFood = List.of(expectedFoodStr.split("; "));

        assertEquals(
                expectedFood,
                new Animal().getFood(animalKind)
        );
    }
}

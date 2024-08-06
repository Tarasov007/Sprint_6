package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionParameterizedTests {

    Feline feline = Mockito.mock(Feline.class);

    static Stream<Arguments> setSexForLion() {
        return Stream.of(
                Arguments.of("Самец", true),
                Arguments.of("Самка", false)
        );
    }

    @ParameterizedTest(name = "Класс Lion. Пол: {0}")
    @MethodSource("setSexForLion")
    @DisplayName("Проверка наличия гривы у льва")
    public void doesHaveMane_IsCorrect(String sex, boolean expectedHasMane) throws Exception {
        Lion lion = new Lion(feline, sex);

        assertEquals(
                expectedHasMane,
                lion.doesHaveMane()
        );
    }
}

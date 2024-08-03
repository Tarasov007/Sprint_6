package com.example;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Mock
    Feline feline;

    @Test
    public void createLion_ExpectedException() throws Exception {
        expectedEx.expect(Exception.class);
        expectedEx.expectMessage("Выберите допустимые значения пола животного - самка или самец");

        new Lion(feline, "Не определено");
    }

    @Test
    public void getKittens_IsCorrect() throws Exception{
        Lion lion = new Lion(feline, "Самец");
        int expectedCount = 5;
        Mockito.when(feline.getKittens()).thenReturn(expectedCount);

        MatcherAssert.assertThat(
                "Некорректное количество котят",
                lion.getKittens(),
                equalTo(expectedCount)
        );
    }

    @Test
    public void getFood_IsCorrect() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expectedListOfFood = List.of("Пища");
        Mockito.when(feline.eatMeat()).thenReturn(expectedListOfFood);

        MatcherAssert.assertThat(
                "Некорректный список еды",
                lion.getFood(),
                equalTo(expectedListOfFood)
        );
    }
}

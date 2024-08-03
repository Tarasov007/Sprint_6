package com.example;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    Feline feline;

    @Test
    public void getSound_IsCorrect() {
        String expectedString = "Мяу";

        MatcherAssert.assertThat("Кот мяукает не так",
                new Cat(feline).getSound(),
                equalTo(expectedString)
        );
    }

    @Test
    public void getFood_IsCorrect() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedListOfFood = List.of("Мясо");
        Mockito.when(feline.eatMeat()).thenReturn(expectedListOfFood);

        MatcherAssert.assertThat("Вернулся некорректный список еды",
                cat.getFood(),
                equalTo(expectedListOfFood)

        );

    }

}

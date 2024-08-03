package com.example;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class FelineTests {

    private final static String UNCORECT_COUNT_KITTENS = "Некорректное количество котят";

    @Test
    public void getFamily_IsCorrect() {
        String expectedFelineFamilyName = "Кошачьи";
        MatcherAssert.assertThat("Некорректное название семейства кошачьих",
                new Feline().getFamily(),
                equalTo(expectedFelineFamilyName)
        );
    }

    @Test
    public void getKittens_InputCountIsCorrect() {
        int expectedCount = 5;
        MatcherAssert.assertThat(
                UNCORECT_COUNT_KITTENS,
                new Feline().getKittens(expectedCount),
                equalTo(expectedCount)
        );
    }

    @Test
    public void getKittens_DefaultIsCorrect() {
        int expectedCount = 1;
        MatcherAssert.assertThat(
                UNCORECT_COUNT_KITTENS,
                new Feline().getKittens(),
                equalTo(expectedCount)
        );
    }

    @Test
    public void eatMeatIsCorrect() throws Exception {
        Feline feline = new Feline();

        MatcherAssert.assertThat(
                "Неправильный список еды",
                feline.eatMeat(),
                equalTo(feline.getFood("Хищник"))
        );
    }
}

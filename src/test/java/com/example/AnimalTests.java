package com.example;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.hamcrest.CoreMatchers.equalTo;

public class AnimalTests {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void getFamily_FamilyIsCorrect() {
        String expectedString = "Существует несколько семейств жювотных: медвежьи, псовые, кошачьи, куньи, заячьи, беличьи, мышиные";

        MatcherAssert.assertThat(
                "Некорректный перечень семейств",
                new Animal().getFamily(),
                equalTo(expectedString)
        );
    }

    @Test
    public void getFood_ExpectedException() throws Exception {
        expectedEx.expect(Exception.class);
        expectedEx.expectMessage("Неизвестный вид животного, используйте значение Хищник или Травоядное");

        new Animal().getFood("");
    }
}

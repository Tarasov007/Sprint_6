package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class AnimalParameterizedTests {

    private final String animalKind;
    private final List<String> expectedFood;

    public AnimalParameterizedTests(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters(name = "Класс Animal. Тип животного: {0}")
    public static Object[][] setParams() {
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыбы")},
                {"Травоядное", List.of("Трава", "Разные растения")}
        };
    }

    @Test
    public void getFood_FoodIsCorrect() throws Exception {
        assertThat("Неправильный набор еды",
                new Animal().getFood(animalKind),
                equalTo(this.expectedFood)
        );
    }

}

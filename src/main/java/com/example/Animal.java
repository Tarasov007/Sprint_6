package com.example;
import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Разные растения");
        } else if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыбы");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Хищник или Травоядное");
        }
    }

    public String getFamily() {
        return "Существует несколько семейств жювотных: медвежьи, псовые, кошачьи, куньи, заячьи, беличьи, мышиные";
    }
}
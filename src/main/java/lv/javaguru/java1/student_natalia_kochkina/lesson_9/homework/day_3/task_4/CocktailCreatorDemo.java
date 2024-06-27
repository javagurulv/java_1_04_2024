package lv.javaguru.java1.student_natalia_kochkina.lesson_9.homework.day_3.task_4;

import java.util.ArrayList;
import java.util.List;

class CocktailCreatorDemo {

    public static void main(String[] args) {
        List<Ingredient> ingredients1 = new ArrayList<>();
        ingredients1.add(new Ingredient("rum", 50));
        ingredients1.add(new Ingredient("Coca-Cola", 120));
        ingredients1.add(new Ingredient("lime juice", 10));

        Cocktail cubaLibre = new CubaLibre(ingredients1);

        System.out.println(cubaLibre.getRecipe());

        List<Ingredient> ingredients2 = new ArrayList<>();
        ingredients2.add(new Ingredient("gin", 50));
        ingredients2.add(new Ingredient("tonic", 100));

        Cocktail ginTonic = new GinTonic(ingredients2);

        System.out.println(ginTonic.getRecipe());
    }

}

package lv.javaguru.java1.student_natalia_kochkina.lesson_9.homework.day_3.task_4;

import java.util.List;

class CubaLibre extends Cocktail {

    private List<Ingredient> ingredients;

    public CubaLibre(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    String getRecipe() {
        String recipe = "CubaLibre = ";
        for (Ingredient ingredient : ingredients) {
            recipe = recipe + ingredient.getAmount()
                    + " " + ingredient.getName() + "  ";
        }
        return recipe;
    }

}

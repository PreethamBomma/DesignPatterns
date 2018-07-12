package abstractFactory;

public class BuilderPattern {


    public static void main(String[] args) {

            MealBuilder mealBuilder = new MealBuilder();

            Meal meal = mealBuilder.prepareMeal();
            System.out.println("Meals");
            meal.showItems();
            System.out.println("Total Cost: " + meal.getCost());

             }
    }


package abstractFactory;
public class MealBuilder {

        public Meal prepareMeal (){
            Meal meal = new Meal();
            meal.addItem(new Bread());
            meal.addItem(new Salad());
            meal.addItem(new Sauce());
            meal.addItem(new Addons());
            return meal;
        }

    }







package lab34.entities;

import java.util.ArrayList;

public class Cafeteria extends Room {
    private ArrayList<Meal> availableMeals;

    public Cafeteria(String name) {
        super(name, null);
        this.availableMeals = new ArrayList<>();
        setTemperature(22);
    }

    public void addMeal(Meal meal) {
        availableMeals.add(meal);
    }

    public Meal serveMeal(String mealType) {
        for (Meal meal : availableMeals) {
            if (meal.getType().equalsIgnoreCase(mealType)) {
                System.out.println("Подан ужин: " + meal.getType());
                return meal;
            }
        }
        System.out.println("Еда типа '" + mealType + "' недоступна.");
        return null;
    }

    public ArrayList<Meal> getAvailableMeals() {
        return availableMeals;
    }
}

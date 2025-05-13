import java.util.*;

public class Cup {
    private Map<String, Integer> cupIngredients = new HashMap<>();

    public Map<String, Integer> getContains() {
        for (String key : cupIngredients.keySet()) {
            System.out.println(key + ": " + cupIngredients.get(key));
        }
        return new HashMap<>(cupIngredients);
    }

    public void addIngredient(String ingredient, int value, LockedRecipes lockedRecipes, UnlockedRecipes unlockedRecipes) {
        cupIngredients.put(ingredient, cupIngredients.getOrDefault(ingredient, 0) + value);

        if (!isFull()) {
            if (equalsAny(lockedRecipes.getAll())) {
                unlockedRecipes.add(new HashMap<>(cupIngredients));
                System.out.println("Good job! Recipe unlocked 🎉");
            }
        } else {
            System.out.println("Cup is full. Would you like to reset?");
            // Simulate user input
            Scanner sc = new Scanner(System.in);
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                cupIngredients.clear();
            }
        }
    }

    public boolean equalsAny(List<Map<String, Integer>> recipeList) {
        for (Map<String, Integer> recipe : recipeList) {
            if (recipe.equals(cupIngredients)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFull() {
        return cupIngredients.size() == 4;
    }

    public void clear() {
        cupIngredients.clear();
    }
}

import java.util.*;

public class Ingredient {
    private String name;
    private int value;

    public Ingredient(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void onClick(Cup cup, LockedRecipes locked, UnlockedRecipes unlocked) {
        if (!cup.isFull()) {
            cup.addIngredient(name, value, locked, unlocked);
        } else {
            System.out.println("Cup is full. Reset?");
            // Simulate user input for reset
            Scanner sc = new Scanner(System.in);
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                cup.clear();
            }
        }
    }
}




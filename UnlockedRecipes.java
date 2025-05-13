import java.util.*;

public class UnlockedRecipes {
    private List<Map<String, Integer>> unlockedRecipeList = new ArrayList<>();

    public void add(Map<String, Integer> recipe) {
        unlockedRecipeList.add(recipe);
    }

    public void showAll() {
        for (Map<String, Integer> recipe : unlockedRecipeList) {
            System.out.println(recipe);
        }
    }
}

import java.util.*;

public class LockedRecipes {
    private List<Map<String, Integer>> lockedRecipeList = new ArrayList<>();

    public void add(Map<String, Integer> recipe) {
        lockedRecipeList.add(recipe);
    }

    public List<Map<String, Integer>> getAll() {
        return lockedRecipeList;
    }
}



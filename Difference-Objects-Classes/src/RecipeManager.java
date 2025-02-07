// This class contains the main method to create and interact with "Recipe" objects
public class RecipeManager {
    public static void main(String[] args) {
        System.out.println("--- Recipe Manager ---");
        System.out.println();
        // Creating objects from the "Recipe" class
        Recipe batch1 = new Recipe("Chocolate Chip Cookies", true, false, false); // Object 1
        Recipe batch2 = new Recipe("Peanut Butter Cookies", false, true, true);  // Object 2
        Recipe batch3 = new Recipe("Oatmeal Raisin Cookies", false, true, false); // Object 3

        // Calling methods on objects to display their information
        System.out.println(); // Space
        batch1.displayRecipeInfo();
        batch2.displayRecipeInfo();
        batch3.displayRecipeInfo();
    }
}

// This class defines the structure for creating "Recipe" objects
public class Recipe {
    // Data fields storing recipe details
    private final String name;
    private final boolean hasChocolateChips;
    private final boolean isGlutenFree;
    private final boolean containsPeanuts;

    // Constructor to initialize "Recipe" objects
    public Recipe(String name, boolean hasChocolateChips, boolean isGlutenFree, boolean containsPeanuts) {
        this.name = name;
        this.hasChocolateChips = hasChocolateChips;
        this.isGlutenFree = isGlutenFree;
        this.containsPeanuts = containsPeanuts;
    }

    // Method to display "Recipe" details
    public void displayRecipeInfo() {
        System.out.println("Recipe Name: " + name);
        System.out.println("Contains Chocolate Chips: " + hasChocolateChips);
        System.out.println("Gluten-Free: " + isGlutenFree);
        System.out.println("Contains Peanuts: " + containsPeanuts);
        System.out.println();
    }
}


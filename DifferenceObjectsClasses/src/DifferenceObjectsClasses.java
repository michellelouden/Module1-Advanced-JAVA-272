// Demonstrating the differences between classes and objects in Java

public class DifferenceObjectsClasses {
    // Fields that define the properties of a recipe
    String name;
    boolean hasChocolateChips;
    boolean isGlutenFree;
    boolean containsPeanuts;

    // Constructor to initialize an object (recipe) with specific details
    public DifferenceObjectsClasses(String name, boolean hasChocolateChips, boolean isGlutenFree, boolean containsPeanuts) {
        this.name = name;
        this.hasChocolateChips = hasChocolateChips;
        this.isGlutenFree = isGlutenFree;
        this.containsPeanuts = containsPeanuts;
    }

    // Method to display recipe information
    public void displayRecipeInfo() {
        System.out.println("Recipe Name: " + name);
        System.out.println("Contains Chocolate Chips: " + hasChocolateChips);
        System.out.println("Gluten-Free: " + isGlutenFree);
        System.out.println("Contains Peanuts: " + containsPeanuts);
        System.out.println();
    }

    // Main method that creates and uses objects
    public static void main(String[] args) {
        System.out.println("--- Difference-Objects-Classes ---\n");
        // Creating objects (instances) from the DifferenceObjectsClasses class
        DifferenceObjectsClasses batch1 = new DifferenceObjectsClasses("Chocolate Chip Cookies", true, false, false);
        DifferenceObjectsClasses batch2 = new DifferenceObjectsClasses("Peanut Butter Cookies", false, true, true);
        DifferenceObjectsClasses batch3 = new DifferenceObjectsClasses("Oatmeal Raisin Cookies", false, true, false);

        // Displays recipe information for all batches
        batch1.displayRecipeInfo();
        batch2.displayRecipeInfo();
        batch3.displayRecipeInfo();
    }
}

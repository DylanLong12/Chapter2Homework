/**
 * This Java program is the Super class
 *
 * @author Dylan Long
 * date: 2/17/24
 * class: ITEC 2150, section 05
 * assignment: Chapter 2 Homework
 *
 * This program has generic fields that child classes can inherit
 */

public class Bread {
    //instance variables for all classes
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName;
    private String state;

    //default constructor
    public Bread() {
        this.flour = 0;
        this.water = 0;
        this.salt = 0;
        this.sugar = 0;
        this.bakingPowder = 0;
        this.yeast = 0;
        this.breadName = null;
        this.state = null;
    }

    //Bread field will be initialized from parameters
    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast,
                 String breadName, String state) {

        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
    }

    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //changes and or prints the status of the bread
    public void bake() {
        if (this.state != "baked") {
            this.state = "baked";
            System.out.println("The" + this.breadName + " is baked now.");
        }
        else {
            System.out.println("Can't bake, " + this.breadName + " is already baked.");
        }
    }

    //short desc of flour (these methods were intended to call inside getIngredients)
    public String readFlour() {
        if (this.flour == 1) {
            return "   " + this.flour + " cup of flour \n";
        }
        return "   " + this.flour + " cups of flour \n";
    }

    //short desc of water (these methods were intended to call inside getIngredients)
    public String readWater() {
        if (this.water == 1) {
            return "   " + this.water + " cup of water \n";
        }
        return "   " + this.water + " cups of water \n";
    }

    //short desc of salt (these methods were intended to call inside getIngredients)
    public String readSalt() {
        if (this.salt == 1) {
            return "   " + this.salt + " tsp of salt \n";
        }
        return "   " + this.salt + " tsps of salt \n";
    }

    //short desc of sugar (these methods were intended to call inside getIngredients)
    public String readSugar() {
        if (this.sugar == 1) {
            return "   " + this.sugar + " cup of sugar \n";
        }
        return "   " + this.sugar + " cups of sugar \n";
    }

    //short desc of baking powder (these methods were intended to call inside getIngredients)
    public String readBakingPowder() {
        if (this.bakingPowder == 1) {
            return "   " + this.bakingPowder + " cup of baking powder \n";
        }
        return "   " + this.bakingPowder + " cups of baking powder \n";
    }

    //short desc of yeast (these methods were intended to call inside getIngredients)
    public String readYeast() {
        if (this.yeast == 1) {
            return "   " + this.yeast + " tsp of yeast \n";
        }
        return "   " + this.yeast + " tsps of yeast \n";
    }

    //short desc of all the ingredients
    public String getIngredients() {
        return "Ingredients for " + this.breadName + " are:\n" +
                this.readFlour() + this.readWater() + this.readSalt() + this.readSugar() +
                this.readBakingPowder() + this.readYeast();
    }


    //short statement of the recipe of the food
    public String recipeHeader() {
        return "A recipe of " + this.breadName + "\n";
    }

    //desc of recipe
    public String recipe() {
        return recipeHeader() +
        "1. Mix flour, yeast, salt, and water.\n" +
        "2. Knead dough until smooth.\n" +
        "3. Let dough rise until doubled.\n" +
        "4. Shape dough and let rise again.\n" +
        "5. Bake until golden.\n";
    }

    //overriding toString
    @Override
    public String toString() {
        return "Bread is the super class.";
    }

    //short statement about bread
    public String breadIsBest() {
        return "Basic bread is cheap and full of carbs!";
    }

}

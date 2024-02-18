/**
 * This Java program is a subclass of Bread
 *
 * @author Dylan Long
 * date: 2/17/24
 * class: ITEC 2150, section 05
 * assignment: Chapter 2 Homework
 *
 * This program inherits fields from bread and has its own unique fields.
 */

public class Muffins extends Bread{
    //instance variables
    private boolean hasBlueberries;
    private boolean sweet;
    private String flavor;

    //default constructor. When object is created, all fields will be default
    public Muffins() {
        super();
        this.setBreadName("Muffins");
        this.hasBlueberries = false;
        this.sweet = false;
        this.flavor = null;
    }

    //will inherit default values from bread and Muffins fields will be assigned from parameters
    public Muffins(boolean hasBlueberries, boolean sweet, String flavor) {
        super();
        this.setBreadName("Muffins");
        this.hasBlueberries = hasBlueberries;
        this.sweet = sweet;
        this.flavor = flavor;
    }

    //will allow all fields from super and Muffins class to be initialized from parameters
    public Muffins(double flour, double water, double salt, double sugar, double bakingPowder, double yeast,
                   String breadName, String state, boolean hasBlueberries, boolean sweet, String flavor) {

        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state);
        this.hasBlueberries = hasBlueberries;
        this.sweet = sweet;
        this.flavor = flavor;
    }

    public boolean isHasBlueberries() {
        return hasBlueberries;
    }

    public void setHasBlueberries(boolean hasBlueberries) {
        this.hasBlueberries = hasBlueberries;
    }

    public boolean isSweet() {
        return sweet;
    }

    public void setSweet(boolean sweet) {
        this.sweet = sweet;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    //overriding recipe method from super
    @Override
    public String recipe() {
        return super.recipeHeader() +
                "1. Gather the following ingredients:\n" +
                super.getIngredients() +
                "2. Stir in " + this.flavor + " with all the ingredients\n" +
                "3. Mix together\n" +
                "4. Bake\n";
    }

    //overriding toString
    @Override
    public String toString() {
        return "Muffin is a child class of Bread.";
    }
}


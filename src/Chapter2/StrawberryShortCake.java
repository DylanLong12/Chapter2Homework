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

public class StrawberryShortCake extends Bread {
    //instance variables
    private int strawberries;
    private double whippedCream;
    private boolean frozen;

    //default constructor. When object is created, all fields will be default
    public StrawberryShortCake() {
        super();
        this.strawberries = 0;
        this.whippedCream = 0; //oz
        this.frozen = false;
    }

    //will inherit default values from bread and Muffins fields will be assigned from parameters
    public StrawberryShortCake(int strawberries, double whippedCream, boolean frozen) {
        super();
        this.strawberries = strawberries;
        this.whippedCream = whippedCream;
        this.frozen = frozen;
    }

    //will allow all fields from super and StrawberryShortCake class to be initialized from parameters
    public StrawberryShortCake(double flour, double water, double salt, double sugar, double bakingPowder, double yeast,
                               String breadName, String state, int strawberries, double whippedCream, boolean frozen) {

        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state);
        this.strawberries = strawberries;
        this.whippedCream = whippedCream;
        this.frozen = frozen;
    }

    public int getStrawberries() {
        return strawberries;
    }

    public void setStrawberries(int strawberries) {
        this.strawberries = strawberries;
    }

    public double getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(double whippedCream) {
        this.whippedCream = whippedCream;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    //short desc of the amount of strawberries
    public String readStrawberries() {
        return "   add " + this.strawberries + " strawberries\n";
    }

    //short desc of the amount of whipped cream
    public String readWhippedCream()  {
        return "   add " + this.whippedCream + " oz of whipped cream\n";
    }

    //overriding recipe method from super
    @Override
    public String recipe() {
        return super.recipeHeader() + "1. Gather the following ingredients:\n" +
                super.getIngredients() + "\n" +
                "2. Mix the following:\n" + this.readStrawberries() + this.readWhippedCream() + "\n" +
                "3. Bake on high for 15 minutes\n" +
                "4. Keep in freezer for 20 minutes\n" +
                "5. Serve";
    }

    //overriding toString
    @Override
    public String toString() {
        return "StrawberryShortCake is a child class of Bread.";
    }
}

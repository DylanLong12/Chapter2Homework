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

public class Bagels extends Bread {
    //instance variables
    private String size;
    private double butter;
    private double creamCheese;

    //default constructor
    public Bagels() {
        super();
        this.size = null;
        this.butter = 0;
        this.creamCheese = 0;
    }

    //will inherit default values from bread and Bagels fields will be assigned from parameters
    public Bagels(String size, double butter, double creamCheese) {
        super();
        this.size = size;
        this.butter = butter;
        this.creamCheese = creamCheese;
    }

    //will allow all fields from super and Bagels class to be initialized from parameters
    public Bagels(double flour, double water, double salt, double sugar, double bakingPowder, double yeast,
                  String breadName, String state, String size, double butter, double creamCheese) {

        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state);
        this.size = size;
        this.butter = butter;
        this.creamCheese = creamCheese;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getButter() {
        return butter;
    }

    public void setButter(double butter) {
        this.butter = butter;
    }

    public double getCreamCheese() {
        return creamCheese;
    }

    public void setCreamCheese(double creamCheese) {
        this.creamCheese = creamCheese;
    }

    //overriding recipe
    @Override
    public String recipe() {
        return super.recipeHeader() +
                "1. Gather " + this.butter + " oz of butter\n" +
                "2. Mix butter with " + this.creamCheese + " oz of cream cheese\n" +
                "3. Layer butter and cream cheese on bagel and enjoy";
    }

    //overriding toString
    @Override
    public String toString () {
        return "Bagels is a subclass of bread";
    }
}

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

//child class of Bread
public class Pastries extends Bread {
    //instance variables
    private boolean hasIcing;
    private int eggs;
    private double vanillaExtract;

    //default constructor. When object is created, all fields will be default
    public Pastries() {
        super();
        this.setBreadName("Pastries");
        this.hasIcing = false;
        this.eggs = 0;
        this.vanillaExtract = 0;
    }

    //will inherit default values from bread and Pastries fields will be assigned from parameters
    public Pastries(boolean hasIcing, int eggs, double vanillaExtract) {
        super();
        this.setBreadName("Pastries");
        this.hasIcing = hasIcing;
        this.eggs = eggs;
        this.vanillaExtract = vanillaExtract;
    }

    //will allow all fields from super and Pastries class to be initialized from parameters
    public Pastries(double flour, double water, double salt, double sugar, double bakingPowder, double yeast,
                    String breadName, String state, boolean hasIcing, int eggs, double vanillaExtract) {

        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state);
        this.hasIcing = hasIcing;
        this.eggs = eggs;
        this.vanillaExtract = vanillaExtract;
    }

    public boolean isHasIcing() {
        return hasIcing;
    }

    public void setHasIcing(boolean hasIcing) {
        this.hasIcing = hasIcing;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public double getVanillaExtract() {
        return vanillaExtract;
    }

    public void setVanillaExtract(double vanillaExtract) {
        this.vanillaExtract = vanillaExtract;
    }

    //overriding recipe method from super
    @Override
    public String recipe() {
        return super.recipeHeader() +
                "1. Gather the following ingredients\n   " + super.readFlour() + "   " + super.readWater() + "   "  + this.getEggs() + " eggs" +
                "   \n   " + this.getVanillaExtract() + " tsps of vanilla extract\n" +
                "2. Adjust water or flour to achieve desired softness.\n" +
                "3. Knead until smooth.\n" +
                "4. Let dough rest.\n" +
                "5. Shape and bake.\n";

    }

    //overriding toString
    @Override
    public String toString() {
        return "Pastries is a child class of Bread.";
    }
}

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
public class Sourdough extends Bread {
    //instance variables
    private double sourdoughStarter;
    private double oliveOil;
    private String softness;

    //default constructor
    public Sourdough() {
        super();
        this.setBreadName("Sourdough");
        this.sourdoughStarter = 0;
        this.oliveOil = 0;
        this.softness = null;
    }

    //will inherit default values from bread and Sourdough fields will be assigned from parameters
    public Sourdough(double sourdoughStarter, double oliveOil, String softness) {
        super();
        this.setBreadName("Sourdough");
        this.sourdoughStarter = sourdoughStarter;
        this.oliveOil = oliveOil;
        this.softness = softness;
    }

    //will allow all fields from super and Sourdough class to be initialized from parameters
    public Sourdough(double flour, double water, double salt, double sugar, double bakingPowder, double yeast,
                     String breadName, String state, double sourdoughStarter, double oliveOil, String softness) {

        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state);
        this.sourdoughStarter = sourdoughStarter;
        this.oliveOil = oliveOil;
        this.softness = softness;
    }

    public double getSourdoughStarter() {
        return sourdoughStarter;
    }

    public void setSourdoughStarter(double sourdoughStarter) {
        this.sourdoughStarter = sourdoughStarter;
    }

    public double getOliveOil() {
        return oliveOil;
    }

    public void setOliveOil(double oliveOil) {
        this.oliveOil = oliveOil;
    }

    public String getSoftness() {
        return softness;
    }

    public void setSoftness(String softness) {
        this.softness = softness;
    }

    //overriding recipe method from super
    public String recipe() {
        return super.recipeHeader() +
        "1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n" +
        "2. Make the dough\n" +
        "3. Bulk Rise\n" +
        "4. Stretch and fold the dough\n" +
        "5. Cut and shape the dough\n" +
        "6. Second rise\n" +
        "6. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
        "7. Spray the loaf with luke warm water.\n" +
        "8. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +
        "9. Remove the bread from the oven.\n" +
        "10. Let the bread cool until good to eat.\n";
    }

    //overriding toString
    @Override
    public String toString() {
        return this.getBreadName() + " is a child class of Bread class because " +
                super.breadIsBest();
    }
}

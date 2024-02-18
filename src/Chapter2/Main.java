/**
 * code tester: this class is used to test the super and child classes
 *
 * purpose: the purpose of testing each class is to see the relationship between child and super classes
 *
 * @author Dylan Long
 * @version 1.0
 * @since 2/15/24
 */

public class Main {
    public static void main(String[] args) {

        //bread testing
        Bread bread = new Bread(4,5,6,7,3,2, "Bread", "not-baked");
        System.out.println(bread.recipe());
        System.out.println(bread);
        System.out.println(bread.getIngredients());
        bread.bake();
        System.out.println("------------------------------------------");

        //sourdough testing
        Sourdough sourdough = new Sourdough(4,5,6,7,3,2, "sourdough", "baked", 6.5, 3,"hard");
        System.out.println(sourdough.recipe());
        System.out.println(sourdough);
        System.out.println(sourdough.getIngredients());
        System.out.println("------------------------------------------");


        //pastries testing
        Pastries p = new Pastries(4,5,6,7,3,2, "pastries", "baked", true, 4, 3);
        System.out.println(p.recipe());
        System.out.println(p);
        System.out.println("------------------------------------------");


        //muffin testing
        Muffins muffins = new Muffins(6,5,6,7,3,2, "Muffins", "baked", true, true, "chocolate");
        System.out.println(muffins.recipe());
        System.out.println(muffins);
        System.out.println(muffins.getIngredients());
        System.out.println("------------------------------------------");


        //StrawberryShortCake testing
        StrawberryShortCake s = new StrawberryShortCake(6,5,6,7,3,2, "StrawberryShortCake", "baked", 4, 7, true);
        System.out.println(s.recipe());
        System.out.println(s);
        System.out.println(s.getIngredients());
        System.out.println("------------------------------------------");

        Bagels bagel = new Bagels(4,5,2,7,1,2, "Bagel", "baked", "small", 4, 3);
        System.out.println(bagel.recipe());
        System.out.println(bagel);
        System.out.println(bagel.getIngredients());

    }
}
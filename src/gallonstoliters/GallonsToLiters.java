/*
 * Try this 1-1
 * 
 * This program converts Gallons to Liters
 */
package gallonstoliters;

/**
 *
 * @author eucosta
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons; //holds the number of gallons
        double liters; // will hold the converted gallons to liters
        
        gallons = 10;
        liters = gallons * 3.7854; //convert to liters
        
        System.out.println(gallons + " gallons is " + liters + " liters");
    }
}

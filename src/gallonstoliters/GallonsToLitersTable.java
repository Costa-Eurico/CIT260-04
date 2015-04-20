/*
 * Try this 1-2 
 * 
 * Displays a conversion table of gallons to liters
 */
package gallonstoliters;

/**
 *
 * @author eucosta
 */
public class GallonsToLitersTable {
    
    public static void main(String args[]){
        double gallons, liters;
        double multiplier = 3.7854;
        int counter = 0;
        
        for(gallons = 1; gallons <= 100; gallons++){
            liters = gallons * multiplier;
            System.out.println(gallons + " gallons is " + liters + " liters");
            
            counter++;
            // every 10th line, print a blank line
            if(counter == 10){
                System.out.println();
                counter = 0;//reset the counter
            }
        }
    }
}

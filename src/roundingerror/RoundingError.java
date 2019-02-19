/*
 * Lewis White
 * February 19, 2019
 * This program will compare the square of the square root, and find the rounding error
 */

package roundingerror;


import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author lewhi7273
 */
public class RoundingError {
    

    public static void main(String[] args) {
        //asks the user for a number
        String orgnum = JOptionPane.showInputDialog("Which number would you like to use? ");
        //changes entry to number
        double newnum = Double.parseDouble(orgnum);
        //squares number
        double a = sqrt(newnum);
        //takes square root
        double b = Math.pow(a,2);
        //Subtract the original number from the final answer
        double johncena = newnum-b;
        //show the results
        JOptionPane.showMessageDialog(null, "The square of the square is: "+b + " The round off error is: " + johncena);
    }
    
}

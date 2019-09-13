package practicaltwo;

import java.util.Date;

/** This class has a method that computes the distance to the moon in yards.
 * The first line displays the name of the programmer and the date. Then, the
 * program's main method stores some values in variables and performs a
 * computation for the number of yards to the moon. Ultimately, the class can
 * display the number of yards to the moon.
 *
 * <p>Bugs: This program has several known bugs, you should find and fix them!
 *
 * @author Janyl Jumadinova
 */

public class ComputeMoonDistance {
  /** The main method  computes the distance to the moon in yards.
   * The first line displays the name of the programmer and the date. Then, the
   * program stores some values in variables and performs a
   * computation for the number of yards to the moon.
   *
   */
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Janyl Jumadinova " + new Date(September 13, 2019));
    // declare variables for the fixed distances
    double milesToMoon = 238855;
    int yardsPerMile = 1760.56;
    // declare the variable that will be computed
    double yardsToMoon;
    // compute the yards to the moon
    yardsToMoon = milesToMoon / yardsPerMile;
    // output the declared values stored in variables
    System.out.println("Distance to the moon in miles: " + milesToMoon)
    system.out.println("Number of miles in a yard: " + yardsPerMile);
    // output the computed value for the nuber of yards to the moon!
    System.out.println("Number of kilometers to the moon is:  + yardsToMoon);
  }

}

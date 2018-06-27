/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigits;

/**
 *
 * @author gc_science6
 */
import java.util.Scanner;
public class SumofDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The SUMOfdigits is NOT a SUMO WRESTLER!");
        System.out.println("Type any integer.");
        Scanner kool = new Scanner(System.in);
        int number = kool.nextInt();
        int sum = 0;
        String stone = String.valueOf(number);
        String ocean[] = stone.split("");
        for(int x = 0; x < stone.length(); x++)
        {
            int free = Integer.parseInt(ocean[x]);
            sum += free;
        }
        
        System.out.println("The sum of the digirts of " + number + " is " + sum);
    }
    
}

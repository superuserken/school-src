/*
 *Author: TAM-OG, KEN MILTON, P.
 *Programming Date: 2025-08-30 , 10:00-11:30 WS
 *Activity Name and Number: Prelim Activity 3
 */

/*
Algorithm
1. Display the basic description of the program
2. Get user input for all the denominations
3. Calculate all the denominations
4. Display the calculated amount
*/

package Prelims;

import java.util.Scanner;

public class PreAct3TamogKenMilton {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);

        // 1. Display the basic description of the program
        System.out.println("Welcome to SLU Money Counting Machine");
        System.out.println("The machine can accept bills and coins.");
        System.out.println("Please enter the number of bills and coins per denomination:");

        // 2. Get user input for all the denominations
        System.out.println("P1000 bill: ");
        int p1000 = Integer.parseInt(kbd.nextLine());
        System.out.println("P500 bill: ");
        int p500 = Integer.parseInt(kbd.nextLine());
        System.out.println("P100 bill: ");
        int p100 = Integer.parseInt(kbd.nextLine());
        System.out.println("P50 bill: ");
        int p50 = Integer.parseInt(kbd.nextLine());
        System.out.println("P20 coin: ");
        int p20 = Integer.parseInt(kbd.nextLine());
        System.out.println("P10 coin: ");
        int p10 = Integer.parseInt(kbd.nextLine());
        System.out.println("P5 coin: ");
        int p5 = Integer.parseInt(kbd.nextLine());
        System.out.println("P1 coin: ");
        int p1 = Integer.parseInt(kbd.nextLine());
        System.out.println("25 cents coin: ");
        double c25 = Double.parseDouble(kbd.nextLine());

        // 3. Calculate all the denominations
        double amount = (p1000 * 1000) + (p500 * 500) + (p100 * 100) + (p50 * 50) + (p20 * 20) + (p10 * 10) + (p5 * 5) + (p1) + (c25 * 0.25);

        // 4. Display the calculated amount
        System.out.println("The total amount is "+amount);

        System.exit(0);
    }
}

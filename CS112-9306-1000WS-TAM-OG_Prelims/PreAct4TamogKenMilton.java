/*
 *Author: TAM-OG, KEN MILTON, P.
 *Programming Date: 2025-09-03 , 10:00-11:30 WS
 *Activity Name and Number: Prelim Activity 4
 */

package Prelims;

import java.util.Scanner;

public class PreAct4TamogKenMilton {
    public static void main (String[] args){
        Scanner kbd = new Scanner(System.in);

        // 1. Display basic instruction to the user
        System.out.println("Welcome to SLU ATM");
        System.out.println("The machine can only dispense amount in increments of 100.");

        // 2. Get user input on how much money is to be withdrawn
        System.out.println("Please enter amount to be withdrawn, whole numbers only: ");
        int amount = Integer.parseInt(kbd.nextLine());

        // 3. Algorithm: Computing how much P1000, P500, P100 to dispense and the total amount per denomination
        int p1000 = (amount / 1000);
        int numberOfP1000 = p1000 * 1000;
        int remaining1 = amount - numberOfP1000;

        int p500 = (remaining1 / 500);
        int numberOfP500 = p500 * 500;
        int remaining2 = remaining1 - numberOfP500;

        int p100 = (remaining2 / 100);
        int numberOfP100 = (p100 * 100);
        int remaining3 = remaining2 - numberOfP100;

        // 4. Show transaction summary
        System.out.println("======================================");
        System.out.println("TRANSACTION SUMMARY:");
        System.out.println("======================================");
        System.out.println("P1000");
        System.out.println("QUANTITY DISPENSED: "+p1000);
        System.out.println("AMOUNT: "+numberOfP1000);
        System.out.println("======================================");
        System.out.println("P500");
        System.out.println("QUANTITY DISPENSED: "+p500);
        System.out.println("AMOUNT: "+numberOfP500);
        System.out.println("======================================");
        System.out.println("P100");
        System.out.println("QUANTITY DISPENSED: "+p100);
        System.out.println("AMOUNT: "+numberOfP100);
        System.out.println("======================================");

        System.exit(0);
    }
}

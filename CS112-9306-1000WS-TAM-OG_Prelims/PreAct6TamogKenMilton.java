/*
 *Author: TAM-OG, KEN MILTON, P.
 *Programming Date: 2025-09-20 , 10:00-11:30 WS
 *Activity Name and Number: Prelim Activity 6
 */

package Prelims;

import java.util.Scanner;

public class PreAct6TamogKenMilton {
    public static void main (String[] args){
        Scanner kbd = new Scanner(System.in);

        // 1. ask the user what type of gasoline and number of liters
        System.out.println("ABC Gas Station");
        System.out.println("Choose petroleum type (type the corresponding letter:");
        System.out.println("A. Regular Gasoline");
        System.out.println("B. Premium Gasoline");
        System.out.println("C. Regular Diesel");
        System.out.println("D. Premium Diesel");
        System.out.println("E. Kerosene");
        System.out.println("Input choice: ");
        char type = kbd.nextLine().charAt(0);
        System.out.println("Input number of liters: ");
        int liters = Integer.parseInt(kbd.nextLine());

        // 2. decision control algorithm + display total
        int amount=0;
        if (type == 'A' || type == 'a'){
            amount = 75*liters;
            System.out.println("Total amount: "+amount);
        } else if (type == 'B' || type == 'b') {
            amount = 65*liters;
            System.out.println("Total amount: "+amount);
        } else if (type == 'C' || type == 'c') {
            amount = 60*liters;
            System.out.println("Total amount: "+amount);
        } else if (type == 'D' || type == 'd') {
            amount = 65*liters;
            System.out.println("Total amount: "+amount);
        } else if (type == 'E' || type == 'e') {
            amount = 80*liters;
            System.out.println("Total amount: "+amount);
        } else
            System.out.println("Your input is invalid. Program will exit...");
            System.exit(0);
    }
}

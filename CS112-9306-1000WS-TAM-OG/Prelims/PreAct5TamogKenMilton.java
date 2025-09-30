/*
*Author: TAM-OG, KEN MILTON, P.
*Programming Date: 2025-09-17 , 10:00-11:30 WS
*Activity Name and Number: Prelim Activity 5
*/

package Prelims;

import java.util.Scanner;

public class PreAct5TamogKenMilton {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);

        // 1. ask the user for their final grade and attendance percentage
        System.out.println("Student Pass/Fail Evaluation");
        System.out.println("Enter final grade (0-100): ");
        int grade = Integer.parseInt(kbd.next());
        System.out.println("Enter attendance percentage (0-100): ");
        int attendance = Integer.parseInt(kbd.next());

        // 2. decision control algorithm
        if (grade >= 101 || attendance >= 101)
            System.out.println("Your input is invalid as you did not input an integer from 0-100.");
        else if (grade >= 75 && attendance >= 80)
            System.out.println("Student PASSES");
        else if (grade >= 0 && attendance >= 0)
            System.out.println("Student FAILS");
        else
            System.out.println("Your input is invalid as you did not input an integer from 0-100.");

        System.exit(0);
    }
}
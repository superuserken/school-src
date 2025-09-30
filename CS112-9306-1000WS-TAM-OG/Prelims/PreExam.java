/*
*Author: TAM-OG, KEN MILTON, P.
*Programming Date: 2025-09-30 , 10:00-11:30 WS
*Activity Name and Number: Prelim Exam
*/

package Prelims;

import java.util.Scanner;

public class PreExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 3-digit control code: ");
        int control = sc.nextInt();

        if (control/100 == 1) {
            System.out.println("Control code is valid. Destination is Luzon.");
        } else if (control/200 == 1) {
            System.out.println("Control code is valid. Destination is Visayas.");
        } else if (control/300 == 1) {
            System.out.println("Control code is valid. Destination is Mindanao.");
        } else {
            System.out.println("Control code is invalid.");
        }
    }
}
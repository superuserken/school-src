// THIS PROGRAM IS UNFINISHED

/*
*Author: TAM-OG, KEN MILTON, P.
*Programming Date: 2025-08-27 , 10:00-11:30 WS
*Activity Name and Number: Prelim Activity 2
*/

package Prelims;
import java.util.Scanner;

public class PreAct2TamogKenMilton {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        // 1. Welcoming the user and displaying the available products
        System.out.println("Welcome to Aling Nena's Store!");
        System.out.println("We have the following products available: Egg, Bread, Butter, Margarine, Cheese");

        // 2. Asking the user for the product name, quantity, unit price, discount, cash tendered + storing the information to the initially declared variable in Step 1
        System.out.println("Please input the product you want to buy: ");
        String product = sc.nextLine();

        System.out.println("Please input the quantity: ");
        double quantity = sc.nextDouble();

        System.out.println("Please input the unit price: ");
        double price = sc.nextDouble();

        System.out.println("Please input the discount in decimal form from 1%-100% (0.01-1): ");
        double discount = sc.nextDouble();

        System.out.println("Please input the cash tendered: ");
        double cash = sc.nextDouble();

        // 3. Calculation algorithm
        double total = quantity * price;
        double discountA = discount * total;
        double pay = total - discountA;

        // 4. Showing the Sales Summary;
        System.out.println("Sales Summary");
        System.out.println("Total Purchase Amount: ");
        System.out.println("Total Discount:");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.exit(0);
    }
}

//Welcome to Aling Nena’s Store
//Please input the following information:
//Product name: eggs
//Quantity: 12
//Unit Price: 5.00
//Discount: 10
//Cash Tendered: 100.00

//Sales Summary
//Total Purchase Amount: 60.00
//Total Discount: 6.00
//Amount To Be Paid: 54.00
//Change: 46.00
//Thank you for your purchase!
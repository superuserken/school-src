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

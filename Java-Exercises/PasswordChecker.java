/*
Name: Drix Omnhie Lope
Section: BSIT 1-1
Programming 1 | Lab Exercise 2
*/
import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String password = "";
        boolean digits = false;
        boolean lowCase = false;
        boolean upCase = false;
        boolean special = false;
        boolean isShort = false;
        boolean hasInvalid = false;

        System.out.println("***** PASSWORD CHECKER *****");
        System.out.println("Password Length: not less than 8 characters.");
        System.out.println("Valid Characters: letters, numbers, and special characters.");
        System.out.println("Valid Special Characters: $, _, #, *, and ^ only.");
        System.out.println();

        System.out.print("Enter your password: ");
        password = input.nextLine();

        if (password.length() < 8) {
            isShort = true;
        }

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);

            if (Character.isLowerCase(character)) {
                lowCase = true;
            } else if (Character.isUpperCase(character)) {
                upCase = true;
            } else if (Character.isDigit(character)) {
                digits = true;
            } else if ("$_#*^".indexOf(character) != -1) {
                special = true;
            } else {
                hasInvalid = true;
            }
        }

        if (!hasInvalid && lowCase && upCase && digits && special && !isShort) {
            System.out.println("Password is valid.");
        } else {
            if (isShort) {
                System.out.println("Password should not be less than 8 characters.");
            }
            if (!digits) {
                System.out.println("Missing Numerical Digit (0-9)");
            }

            if (!lowCase) {
                System.out.println("Missing Lowercase Letter (a-z)");
            }

            if (!upCase) {
                System.out.println("Missing Uppercase Letter (A-Z)");
            }

            if (!special) {
                System.out.println("Missing Special Character");
            }

            System.out.println("Password is invalid.");
        }
    input.close();
    }
}

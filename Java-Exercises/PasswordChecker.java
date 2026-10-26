/*
Name: Drix Omnhie Lope
Section: BSIT 1-1
Programming 1 | Lab Exercise 2
*/
import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) {
        // setting up variables in the program
        Scanner input = new Scanner (System.in);

        String password = "";
        boolean digits = false;
        boolean lowCase = false;
        boolean upCase = false;
        boolean special = false;
        boolean isShort = false;
        boolean hasInvalid = false;

        // menu of the program
        System.out.println("***** PASSWORD CHECKER *****");
        System.out.println("Password Length: not less than 8 characters.");
        System.out.println("Valid Characters: letters, numbers, and special characters.");
        System.out.println("Valid Special Characters: $, _, #, *, and ^ only.");
        System.out.println();

        // get the input of the password from the user
        System.out.print("Enter your password: ");
        password = input.nextLine();

        // check if the password's length is less than the minimum of 8 characters
        if (password.length() < 8) {
            isShort = true;
        }

        // a loop that check each character of the password and confirm whether it is valid or not
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);

            if (Character.isLowerCase(character)) { // if lowercase character
                lowCase = true;
            } else if (Character.isUpperCase(character)) { // if uppercase character
                upCase = true;
            } else if (Character.isDigit(character)) { // if digit character
                digits = true;
            } else if ("$_#*^".indexOf(character) != -1) { // if it's one of the special character listed here
                special = true;
            } else { // else, if everything is false above, it will become invalid character
                hasInvalid = true;
            }
        }

        // confirms if the password is valid
        if (!hasInvalid && lowCase && upCase && digits && special && !isShort) {
            System.out.println("Password is valid.");
        } else { // else if there are any violated rules, display the exact problems or violations
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

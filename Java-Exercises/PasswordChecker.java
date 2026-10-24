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

        System.out.println("***** PASSWORD CHECKER *****");
        System.out.println("Password Length: not less than 8 characters.");
        System.out.println("Valid Characters: letters, numbers, and special characters.");
        System.out.println("Valid Special Characters: $, _, #, *, and ^ only.");
        System.out.println();

        System.out.print("Enter your password: ");
        password = input.next();

        if (password.length() < 8) {
            System.out.println("Password should not be less than 8 characters.");
        } 

    }
}

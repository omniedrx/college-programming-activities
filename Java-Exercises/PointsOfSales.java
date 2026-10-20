/*
Name: Drix Omnhie Lope
Section: BSIT 1-1
Programming | Lab Exercise 1
 */

import java.text.DecimalFormat;
import java.util.*;
public class PointsOfSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //setting up variables
        String itemName = "";
        double price = 0;
        int order;
        int quantity;
        String repeat;
        double total;
        double subtotal = 0;

        //main program
        do {
            System.out.println("    <***** MENU FOR TODAY *****>    ");
            System.out.println("                                      ");
            System.out.println(" [1] - Hamburger Combo     Php 100.00 ");
            System.out.println(" [2] - Cheeseburger Combo  Php 150.00 ");
            System.out.println(" [3] - Hotdog Combo        Php  90.00 ");
            System.out.println(" [4] - Spaghetti Combo     Php 125.00 ");
            System.out.println("");
            System.out.println();

            //gets the order of user
            System.out.print("What is your order? ");
            order = input.nextInt();

            //process and checks if choice was valid
            boolean validChoice = true;
            switch (order) {
                case 1:
                    itemName = "Hamburger Combo";
                    price = 100.00;
                    break;
                case 2: 
                    itemName = "Cheeseburger Combo";
                    price = 150.00;
                    break;
                case 3:
                    itemName = "Hotdog Combo";
                    price = 90.00;
                    break;
                case 4:
                    itemName = "Spaghetti Combo";
                    price = 125.00;
                    break;
                default:
                    validChoice = false;
                    System.out.println("Invalid choice. Choose only from 1-4.");
            }

            //asks quantity only if choice was valid
            if (validChoice) {
                System.out.println("You ordered " + itemName + ".");
                System.out.println("How many would you like to order? ");
                quantity = input.nextInt();

                //calculates current total and subtotal
                total = price * quantity;
                subtotal += total;
            }

            //asks user if they want to order more         
            System.out.print("Would you like to order more? y/n: ");
            repeat = input.next();
        } while (repeat.equalsIgnoreCase("y"));

        //compute vatable amount, vat, and change
        double vatableAmount = subtotal / 1.12;
        double cashTendered;
        System.out.println("Your total bill is: Php " + subtotal);
        System.out.println("Vatable Amount: Php " + df.format(vatableAmount));
        System.out.println("Value Added Tax: Php " + df.format((vatableAmount * 0.12)));

        // keep asking until user entered value that is equal or greater than the bill
        do {
            System.out.print("Cash tendered: Php ");
            cashTendered = input.nextDouble();
        } while (cashTendered < subtotal);

        System.out.println("Change: Php " + df.format((cashTendered - subtotal)));
        input.close();
    }
}           
/**
This program is for a vending machine that vends multiple cans at a time.

It keeps track of how many cans it has vended and how much money it would collect after
each of the 3 times it asks the user how many cans they want.

At the end it prints out the number of cans remaining and the total cost.

Author: Justin Harding
SID: 450221916
INFO 1103
Date: 2015-03-16
*/

// importing necessary predefined classes
import java.util.Scanner;
import java.text.NumberFormat;

public class VendingMachine {

	public static void main (String[] args) {

		// declaring variables
		double canPrice, cost;
		int cansWant, cansLeft, cansVended, repeat;

		// using NumberFormat class to display dollar values correctly
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();

		// using Scanner class to detect input from keyboard
		Scanner keyboard = new Scanner(System.in);

		// initializing variables
    canPrice = 1.50;
    cost = 0.00;
    cansWant = 0;
    cansLeft = 300;
    cansVended = 0;

    // display cans remaining and price of each can
    System.out.println("There are " + cansLeft + " cans remaining");
    System.out.println("Each can costs " + moneyFormat.format(canPrice));

   	// for loop to run the containing code 3 times
   	for (repeat = 0; repeat < 3; repeat ++) {

			// asks user for input and assigns the number of cans they want to cansWant
			System.out.println("Please enter the number of cans you would like");
			cansWant = keyboard.nextInt();

			// uses cansWant to update number of cans vended and cost
			cansVended = cansVended + cansWant;
			cost = cost + (cansWant * canPrice);
		}

		// after the loop ends, update cans remaining
		cansLeft = cansLeft - cansVended;

		// then display cans remaining and total cost
		System.out.println("There are " + cansLeft + " cans remaining");
		System.out.println("The total price is " + moneyFormat.format(cost));
	}
}

import java.util.Scanner;

import java.util.InputMismatchException

public class ATMGame {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int yesOrNo = 1;

        do {
                System.out.println("Welcome to Kate Bank, where everyone is friendly! What would you like to do?");
                System.out.println("(Enter a number to select an option)");
                System.out.println();
                System.out.println("1: Check Account Balance");
                System.out.println("2: Withdraw Funds");
                System.out.println("3: Deposit Funds");
                System.out.println("4: Hear a funny joke.");

                int yourChoice = in.nextInt();

                    switch (yourChoice) {
                        case 1:
                            System.out.println("\nYour account balance is $1,000,000. Surprise!");
                            break;
                        case 2:
                            System.out.println("\nHow much would you like to withdraw? Enter the number with NO $ sign or commas!");
                            try {double myWithdraw = in.nextDouble();
                                System.out.println("You have withdrawn $" + myWithdraw + "0.");}
                            catch (InputMismatchException exception) {
                                System.out.println("This is not an integer. You have broken the ATM. Start over.");
                            }
                            break;
                        case 3:
                            System.out.println("\nHow much would you like to deposit? Enter the number with NO $ sign or commas!");
                            try {double myDeposit = in.nextDouble();
                                System.out.println("You have withdrawn $" + myDeposit + "0.");}
                            catch (InputMismatchException exception) {
                                System.out.println("This is not an integer. You have broken the ATM. Start over.");
                            }
                            break;
                        case 4:
                            System.out.println("\nA horse walks into a bar. The bartender says: 'Hey buddy, why the long face?' HAHAHAHA.");
                            break;
                        default:
                            System.out.println("\nSorry, that's not an option! Try again!");
                    }
                    System.out.println();
                    System.out.println("Would you like to complete other transactions today? If so, press 1! ");
                    yesOrNo = in.nextInt();

        }
        while (yesOrNo == 1) ;
    }
}
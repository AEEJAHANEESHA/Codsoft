

import java.util.Scanner;

public class task3 {

    public static class ATM {
        private int balance = 0;

        public ATM() {
            boolean process = true;
            while (process) {
                Scanner sc = new Scanner(System.in);
                displayMenu();
                System.out.print("Enter the number to perform the action: ");
                int action = sc.nextInt();

                switch (action) {
                    case 1:
                        System.out.print("Enter the amount to be deposited: ");
                        int depositAmount = sc.nextInt();
                        deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        int withdrawAmount = sc.nextInt();
                        withdraw(withdrawAmount);
                        break;

                    case 3:
                        System.out.println("Your balance is: " + checkBalance());
                        break;

                    default:
                        System.out.println("Error: Invalid option");
                        break;
                }

                System.out.println("\nDo you want to perform any other actions?");
                System.out.print("If yes, type 'true'; to end session, type 'false': ");
                process = sc.nextBoolean();
            }
        }

        private void displayMenu() {
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance");
        }

        private int checkBalance() {
            return this.balance;
        }

        private int deposit(int amount) {
            this.balance += amount;
            System.out.println("Amount deposited successfully");
            return this.balance;
        }

        private int withdraw(int amount) {
            if (this.balance < amount) {
                System.out.println("Insufficient Funds");
                return -1;
            }

            this.balance -= amount;
            System.out.println("Amount debited successfully");
            return this.balance;
        }
    }

    private static class UserBank {
        // Add any user-specific functionality here
    }

    public static void main(String[] args) {
        ATM haneesha = new ATM();
    }
}


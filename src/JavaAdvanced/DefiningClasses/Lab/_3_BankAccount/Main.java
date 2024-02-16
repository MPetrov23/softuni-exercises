package JavaAdvanced.DefiningClasses.Lab._3_BankAccount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccounts = new LinkedHashMap<>();
        String command = sc.nextLine();

        while (!"End".equals(command)) {
            String[] commandParts = command.split("\\s+");
            String action = commandParts[0];

            switch (action) {
                case "Create":
                    create(bankAccounts);
                    break;
                case "Deposit":
                    int id = Integer.parseInt(commandParts[1]);
                    double deposit = Double.parseDouble(commandParts[2]);
                    deposit(id, deposit, bankAccounts);
                    break;
                case "SetInterest":
                    double newInterestRate = Double.parseDouble(commandParts[1]);
                    setInterest(newInterestRate);
                    break;
                case "GetInterest":
                    int accId = Integer.parseInt(commandParts[1]);
                    int years = Integer.parseInt(commandParts[2]);
                    getInterest(accId, years, bankAccounts);
                    break;

            }
            command = sc.nextLine();
        }
    }

    private static void create(Map<Integer, BankAccount> bankAccounts) {
        BankAccount bankAccount = new BankAccount();
        bankAccounts.put(bankAccount.getId(), bankAccount);
        bankAccount.print();
    }

    private static void deposit(int id, double depositAmount, Map<Integer, BankAccount> bank) {

        BankAccount bankAccount = bank.get(id);
        if (bankAccount != null) {
            bankAccount.deposit(depositAmount);
            System.out.printf("Deposited %.0f to ID%d%n", depositAmount, id);
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void setInterest(double interest) {
        BankAccount.setInterestRate(interest);
    }

    private static void getInterest(int id, int years, Map<Integer, BankAccount> bankAccounts) {
        BankAccount bankAccount = bankAccounts.get(id);
        if (bankAccount != null) {
            System.out.printf("%.2f%n", bankAccount.getInterest(years));
        } else {
            System.out.printf("Account does not exist%n");
        }
    }
}
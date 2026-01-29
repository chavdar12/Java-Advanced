package src.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Deposit" -> bankAccount.deposit(Double.parseDouble(tokens[1]));
                case "Withdraw" -> bankAccount.withdraw(Double.parseDouble(tokens[1]));
            }
            input = scanner.nextLine();
        }
        System.out.println(bankAccount);
    }
}

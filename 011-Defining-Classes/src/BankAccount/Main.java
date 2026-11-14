package BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccounts accounts = new BankAccounts();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Create" -> accounts.addNewBankAccount(new BankAccount());
                case "Deposit" -> {
                    int id = Integer.parseInt(tokens[1]);
                    if (accounts.isExist(id)) {
                        accounts.getUser(id).deposit(Double.parseDouble(tokens[2]));
                    }
                }
                case "Withdraw" -> {
                    int id = Integer.parseInt(tokens[1]);
                    if (accounts.isExist(id)) {
                        accounts.getUser(id).withdraw(Double.parseDouble(tokens[2]));
                    }
                }
                case "SetInterest" -> BankAccount.setInterestRate(Double.parseDouble(tokens[1]));
                case "GetInterest" -> {
                    int id = Integer.parseInt(tokens[1]);
                    if (accounts.isExist(id)) {
                        System.out.printf("%.2f%n", accounts.getUser(id).getInterest(Integer.parseInt(tokens[2])));
                    }
                }
            }
            input = scanner.nextLine();
        }
    }
}

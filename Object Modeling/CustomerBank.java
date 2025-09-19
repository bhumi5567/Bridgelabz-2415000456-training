package ObjectModeling;

import java.util.ArrayList;

class Bank {
    String name;
    ArrayList<Account> accounts;

    Bank(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    void openAccount(Customer customer, double balance) {
        Account acc = new Account(customer, this, balance);
        accounts.add(acc);
        customer.addAccount(acc);
    }
}

class Customer {
    String name;
    ArrayList<Account> accounts;

    Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.bank.name + ", Balance: " + acc.balance);
        }
    }
}

class Account {
    Customer customer;
    Bank bank;
    double balance;

    Account(Customer customer, Bank bank, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;
    }
}

public class CustomerBank {
    public static void main(String[] args) {
        Bank bank1 = new Bank("ABC Bank");
        Customer cust1 = new Customer("Alice");

        bank1.openAccount(cust1, 1000.0);
        bank1.openAccount(cust1, 2500.0);

        cust1.viewBalance();
    }
}


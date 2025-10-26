package com.techelevator;

import java.util.ArrayList;
import java.util.List;


public class BankCustomer {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //public List<Accountable> getAccounts(){
    //       return accounts;

    public Accountable[] getAccounts() {
        Accountable[] account = new Accountable[accounts.size()];

        for (int i = 0; i < accounts.size(); i++) {
            account[i] = accounts.get(i);

        }
        return account;
    }


    public void addAccount(Accountable newAccount) {

        accounts.add(newAccount);
    }

    public boolean isVip() {
        boolean isVip = false;
        int sum = 0;
        int minimum = 25000;

        for (Accountable account : accounts) {
            sum += account.getBalance();
            if (sum < minimum) {
                isVip = false;
            }
            if (sum >= 25000) {
                isVip = true;
            }
        }

        return isVip;
    }


    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer();
        customer.setName("John Smith");
        customer.setAddress("123 Main St");
        customer.setPhoneNumber("555-1234");

        // Add some accounts to the customer
        SavingsAccount savingsAccount = new SavingsAccount("Savings123", "5000", 2000);
        CheckingAccount checkingAccount = new CheckingAccount("Checking456", "10000", 1000);
        CreditCardAccount creditCardAccount = new CreditCardAccount("Credit789", "123456789");
        creditCardAccount.charge(5000);
        customer.addAccount(savingsAccount);
        customer.addAccount(checkingAccount);
        customer.addAccount(creditCardAccount);


        //Check the balance of John Smith's creditCardAccount
        System.out.println("Credit Card Account Balance: " + creditCardAccount.getBalance());
        creditCardAccount.pay(1000);
        System.out.println("Credit Card Account Balance after payment: " + creditCardAccount.getBalance());
        savingsAccount.transferTo(checkingAccount, 1000);
        System.out.println("Savings Account Balance after transfer: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance after receiving transfer: " + checkingAccount.getBalance());
        savingsAccount.withdraw(900);
        System.out.println("Savings Account Balance after withdrawal: " + savingsAccount.getBalance());



        // Check if the customer is a VIP
        if (customer.isVip()) {
            System.out.println(customer.getName() + " is a VIP.");
        } else {
            System.out.println(customer.getName() + " is not a VIP.");
        }
    }
}


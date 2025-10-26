package com.techelevator;

public class CreditCardAccount implements Accountable {

    private String accountHolder;
    private String accountNumber;
    private int debt;

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    //constructor

    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.debt = 0;
    }

    public int pay(int amountToPay) {
            debt -= amountToPay;
        return getDebt();
    }


        public int charge (int amountToCharge){
                debt += amountToCharge;
            return getDebt();
        }

    @Override
    public int getBalance() {
        return getDebt() * -1;
    }


public static void main( String[]args){

        CreditCardAccount creditCard = new CreditCardAccount("Albert", "789Romantic");
        creditCard.debt = 4300;
        creditCard.charge(456);
        System.out.println(creditCard.getDebt());

}



}

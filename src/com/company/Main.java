package com.company;


public class Main {

    public static void main(String[] args) {
    BankAccount ErlanBankAccount = new BankAccount();
    ErlanBankAccount.deposit(20000);
    while (true){
       try{
           System.out.println("остаток на счёте: "+ErlanBankAccount.getAmount());
           ErlanBankAccount.withDraw(6000);
       }catch (LimitException e){
           System.out.println("Cнята сумма : "+e.getRemainingAmount()+e.getMessage());
           try {
               ErlanBankAccount.withDraw((int) ErlanBankAccount.getAmount());
           }catch (LimitException exception){
               exception.printStackTrace();
           }
           break;
       }

    }
        System.out.println("остаток на счёте: "+ErlanBankAccount.getAmount());


    }
}

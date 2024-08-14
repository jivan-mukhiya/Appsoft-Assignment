package com.Atm_system;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {

    //for read value
    private static Scanner scanner = new Scanner(System.in);

    //For pin
    static boolean accountPin(String[] account){

        int chance =3;
        boolean flag = false;
        do {
            System.out.println("Enter your pin :");
            String pinNumber= scanner.nextLine();
            if(pinNumber.length()==4){
                if(pinNumber.equals(account[2])){
                    flag= true;
                    chance=0;
                }else{
                    System.out.println("Invalid Pin");
                    chance--;
                }
            }else {
                System.out.println("Pin must be 4 digits");
                chance--;

            }
        }while (chance>0);

        return flag;
    }

    //for Withdraw
    static void withdraw(String[] account){
        boolean flag=true;

       while(flag){
           System.out.println("Enter amount do you want to withdraw: ");
          int withdrawAmount= scanner.nextInt();
           if(withdrawAmount>=1000 ){
              if(Integer.parseInt(account[3])>=withdrawAmount){
                  int amount =Integer.parseInt(account[3])-withdrawAmount;
                  account[3]= String.valueOf(amount);

                  System.out.println("withdraw successful !!");
                  flag=false;
              }else {
                  System.out.println("Insufficient Balance");
              }
           }else {
               System.out.println("Invalid Amount");
           }
       }

    }

    //for balance Inquiry
    static void accountInquiry(String[] account){
        System.out.println("Account Number: "+account[0]);
        System.out.println("Account Holder name: "+account[1]);
        System.out.println("Account Balance: "+account[3]);


    }

//for fund transfer
    static void transfer(String[] senderAccount,String[] receiverAccount){

        boolean flag=true;

       while(flag){
           System.out.println("Enter receiver Account Number :");
           String receiver= scanner.next();
           if(receiverAccount[0].equals(receiver)){
               System.out.println("Enter amount :");
             int  transferAmount= scanner.nextInt();
               if(transferAmount>=1000 ){
                   if(Integer.parseInt(senderAccount[3])>=transferAmount){
                       int amount= Integer.parseInt(senderAccount[3])-transferAmount;
                       senderAccount[3]= String.valueOf(amount);
                       int amount2= Integer.parseInt(receiverAccount[3])+transferAmount;
                       receiverAccount[3]= String.valueOf(amount2);

                       System.out.println("Transfer successful !!");
                       flag=false;
                   }else {
                       System.out.println("Insufficient Balance");
                   }
               }else {
                   System.out.println("Invalid Amount");
               }
           }else {
               System.out.println("Invalid Account");
           }

       }
    }

    //main function
    public static void main(String[] args) {
        // Store account details
        //(account Number,Account Holder Name,pin,total balance)
        String[] account1 = {"100101", "jiban mukhiya", "4444", "10000"};
        String[] account2 = {"100102", "sabin party", "3333", "10000"};

        boolean isValid = accountPin(account1);

        while (isValid) {
            System.out.println("Enter Your choice !");
            System.out.println("1. withdraw");
            System.out.println("2. fund transfer");
            System.out.println("3. Inquiry");
            System.out.println("4. Exit ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    withdraw(account1);
                    break;
                case 2:
                    transfer(account1, account2);
                    break;
                case 3:
                    accountInquiry(account1);
                    break;
                case 4:
                    System.out.println("Thank You !");
                    isValid = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        }
    }

}

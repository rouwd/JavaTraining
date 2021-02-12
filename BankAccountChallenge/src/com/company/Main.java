package com.company;

import java.lang.reflect.AccessibleObject;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
//	    BankAccount bankAccount = new BankAccount(12345,30,"John Smith", "test@test.com", "222-222-2222");
//	    bankAccount.setAccountNumber(98765);
//	    bankAccount.setCustomerName("Daddy Warbucks");
//	    bankAccount.setEmail("daddy@warbucks.com");
//	    bankAccount.setPhoneNumber("123-456-7890");
//	    bankAccount.setBalance(100);

//        System.out.println(bankAccount.getAccountNumber());
//        System.out.println(bankAccount.getBalance());
//        System.out.println(bankAccount.getCustomerName());
//        System.out.println(bankAccount.getEmail());
//        System.out.println(bankAccount.getPhoneNumber());
//
//        bankAccount.depositFunds(25);
//        bankAccount.withdrawFunds(100.50);
//        bankAccount.withdrawFunds(50);

//        BankAccount dansAccount = new BankAccount("Dan", "dan@dan.com", "999-888-7777");

        VipCustomer one = new VipCustomer();
        VipCustomer two = new VipCustomer("Two", "two@me.com");
        VipCustomer three = new VipCustomer("Three", 300.00, "three@me.com");

        System.out.println(one.getName());
        System.out.println(one.getCreditLimit());
        System.out.println(one.getEmailAddress());

        System.out.println(two.getName());
        System.out.println(two.getCreditLimit());
        System.out.println(two.getEmailAddress());

        System.out.println(three.getName());
        System.out.println(three.getCreditLimit());
        System.out.println(three.getEmailAddress());
    }

}

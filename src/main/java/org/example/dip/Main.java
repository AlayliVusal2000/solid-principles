package org.example.dip;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Account account = new Account();
        Bank bank = new Bank(user, account);
        System.out.println(bank);

        //TODO Changes made in subclasses should not affect parent classes

    }
}
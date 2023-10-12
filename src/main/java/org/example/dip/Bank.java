package org.example.dip;

public class Bank {
    User user;
    Account account;

    public Bank(User user, Account account) {
        this.user = user;
        this.account = account;
    }

    @Override
    public String toString() {
        return "Bank{user=%s, account=%s}"
                .formatted(user, account);

    }
}

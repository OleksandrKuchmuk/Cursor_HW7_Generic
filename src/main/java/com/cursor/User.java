package com.cursor;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Account> accountList = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(Account account) {
        accountList.add(account);
    }

    public String getName() {
        return name;
    }
}
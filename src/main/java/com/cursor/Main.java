package com.cursor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        UserService userService = new UserService();
        User user = new User("John");
        userService.addAccount(user, new CreditAccount(1, 1000));
        userService.addAccount(user, new DebitAccount("first", 10000));
        userService.addAccount(user, new DebitAccount("second", 12568));

        User user1 = new User("Mike");
        userService.addAccount(user1, new DebitAccount("A1", 1459));
        userService.addAccount(user1, new CreditAccount(5458, 78964));
        userService.addAccount(user1, new DebitAccount("H345", 7899634));

        User user2 = new User("Adam");
        userService.addAccount(user2, new DebitAccount("asf", 45646));
        userService.addAccount(user2, new DebitAccount("zdf", 5646));
        userService.addAccount(user2, new CreditAccount(258, 68768));
        userService.addAccount(user2, new CreditAccount(3547, 253456));

        // Show all users, sorted by username
        userService.showAllUsersSortingByUsername();

        //Show all accounts
        ArrayList<User> usersList = new ArrayList<>();
        usersList.add(user);
        usersList.add(user1);
        usersList.add(user2);
        userService.showAllAccounts(usersList);

        // return the amount of tax for a person who is calculated as the total amount on the account * 0.05
        LOGGER.info("\nAmount of tax for a person who is calculated is: " + userService.taxAmount(user1.getAccountList().get(2)));
    }
}
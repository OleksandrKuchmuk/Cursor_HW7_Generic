package com.cursor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class UserService<G extends Account, User> {
    public static final Logger LOGGER = LogManager.getLogger(UserService.class);
    private Map<com.cursor.User, List<Account>> usersMap = new HashMap<com.cursor.User, List<Account>>();

    public void addAccount(com.cursor.User user, Account account) {
        user.setAccountList(account);
        usersMap.put(user, user.getAccountList());
    }

    public void showAllUsersSortingByUsername() {
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<com.cursor.User, List<Account>> entry : usersMap.entrySet()) {
            names.add(entry.getKey().getName());
        }
        Collections.sort(names);
        for (String name : names) {
            LOGGER.info(name);
        }
    }

    public void showAllAccounts(ArrayList<com.cursor.User> usersList) {
        for (Map.Entry<com.cursor.User, List<Account>> user : usersMap.entrySet()) {
           LOGGER.info("\n"+user.getKey().getName() + " has accounts:\n" + user.getValue());
        }
    }

    public double taxAmount(Account userAccount) {
       return userAccount.getSum()*0.05;
    }

//    public void transaction(Account accountUserFrom, Account accountUserTo, int sum ){
//        LOGGER.info("\nAccount from balance: "+accountUserFrom.getSum()+
//        "\naccount To balance: "+accountUserTo.getSum());
//
//        if (accountUserFrom.getSum()<sum && accountUserFrom.getId().getClass().toString().compareTo("class java.lang.String")==0){
//            LOGGER.error("Transaction is filed, check your balance");
//        }
//        accountUserFrom.setSum(accountUserFrom.getSum()-sum);
//        accountUserTo.setSum(accountUserTo.getSum()+sum);
//        LOGGER.info("\nAccount from balance after transaction: "+accountUserFrom.getSum()+
//        "Account to balance after transaction: "+accountUserTo.getSum());
//    }

}

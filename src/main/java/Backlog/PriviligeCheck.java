package Backlog;

import Account.Account;

public class PriviligeCheck {

    public static boolean CheckPrivilage(Account account, Class accountType){
        return account.getClass() == accountType;
    }
}

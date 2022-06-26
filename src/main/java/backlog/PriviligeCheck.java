package backlog;

import account.Account;

public class PriviligeCheck {

    private PriviligeCheck() {
    }

    public static boolean checkPrivilege(Account account, String accountType){
        return account.getClass().toString().equals(accountType);
    }
}

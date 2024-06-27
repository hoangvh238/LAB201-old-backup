package model.User;

import model.User.Information.Account;
import model.User.Information.Password;

public class User {
    Account account;
    Password password;

    public User(Account account, Password password) {
        this.account = account;
        this.password = password;
    }

}

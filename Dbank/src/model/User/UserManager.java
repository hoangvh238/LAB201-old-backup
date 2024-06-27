package model.User;

import java.util.ArrayList;

public class UserManager {
    ArrayList userList = new ArrayList();

    public void addUser(User user)
    {
        userList.add(user);
    }
}

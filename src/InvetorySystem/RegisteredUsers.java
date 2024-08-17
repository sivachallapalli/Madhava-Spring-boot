package InvetorySystem;

import Entities.User;

import java.util.ArrayList;
import java.util.List;

public class RegisteredUsers {
    private List<User> users;

    public RegisteredUsers(){
        this.users = new ArrayList<User>();
    }
    public void registerUser(User user){
        users.add(user);
    }
}

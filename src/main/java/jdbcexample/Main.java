package jdbcexample;

import jdbcexample.db.SingletonExample;
import jdbcexample.manager.UserManager;
import jdbcexample.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        try {
            //      User user = new User("poxos","poxosyan","poxos@mail.com","poxos");
            //    userManager.addUser(user);
            //   System.out.println(user);
            List<User> allUsers = userManager.getAllUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }
            userManager.deleteUserById(2);
            allUsers = userManager.getAllUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

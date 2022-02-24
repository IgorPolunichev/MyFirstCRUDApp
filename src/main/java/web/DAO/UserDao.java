package web.DAO;

import web.Model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> listUser();
    void editUser (User user);
    void removeUser(int id);
    User getUserById (int id);


}

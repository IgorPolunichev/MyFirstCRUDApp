package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDao;
import web.Model.User;

import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class UserServImpl implements UserServ {

    @Autowired
    private UserDao userDao;


    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public List<User> listUser() {

        return userDao.listUser();
    }

    @Transactional
    @Override
    public void editUser(User user) {
        userDao.editUser(user);

    }

    @Transactional
    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);

    }

    @Transactional
    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}

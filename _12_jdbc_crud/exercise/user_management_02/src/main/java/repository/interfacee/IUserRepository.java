package repository.interfacee;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectUsersByCountry(String country);

    List<User> selectAllUsers();

    List<User> sortByName();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;
}

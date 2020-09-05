/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author USER
 */
public class UserDAO extends DBContext {

    public User getUserByUsernameAndPassword(String username, String password) {
        try {
            String sql = "SELECT [username]\n"
                    + "      ,[password]\n"
                    + "  FROM [dbo].[User]"
                    + " WHERE [username] = ? AND [password] = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insert(User user) {
        try {
            connection.setAutoCommit(false);
            String sql_insert_book = "INSERT INTO [dbo].[User]\n"
                    + "           ([username]\n"
                    + "           ,[password])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?)";
            PreparedStatement statement_insert_book
                    = connection.prepareStatement(sql_insert_book);
            statement_insert_book.setString(1, user.getUsername());
            statement_insert_book.setString(2, user.getPassword());
            statement_insert_book.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}

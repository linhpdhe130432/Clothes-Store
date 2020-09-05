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
import model.Order;
import model.OrderLine;

/**
 *
 * @author USER
 */
public class OrderDAO extends DBContext {

    public int insert(Order order) {
        int result = 0;
        try {
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            //add new order
            String sql_insert_order = "INSERT INTO [dbo].[Orders]\n"
                    + "           ([id]\n"
                    + "           ,[date]\n"
                    + "           ,[customer])\n"
                    + "     VALUES\n"
                    + "           (GETDATE()\n"
                    + "           ,?)";
            PreparedStatement st_insert_order
                    = connection.prepareStatement(sql_insert_order);
            st_insert_order.setString(1, order.getCustomer().getUsername());
            st_insert_order.executeUpdate();

            //get orderid
            String sql_get_orderid = "SELECT @@IDENTITY as oid";
            PreparedStatement st_get_orderid
                    = connection.prepareStatement(sql_get_orderid);
            ResultSet rs = st_get_orderid.executeQuery();
            if (rs.next()) {
                order.setId(rs.getInt("oid"));
            }
            //insert into orderline
            String sql_insert_line = "INSERT INTO [OrderLine]\n"
                    + "           ([oid]\n"
                    + "      ,[pid]\n"
                    + "      ,[quantity]\n"
                    + "      ,[price])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            for (OrderLine line : order.getLines()) {
                PreparedStatement st_insert_line
                        = connection.prepareStatement(sql_insert_line);
                st_insert_line.setInt(1, order.getId());
                st_insert_line.setInt(2, line.getProduct().getId());
                st_insert_line.setInt(3, line.getQuantity());
                st_insert_line.setInt(4, line.getPrice());
                st_insert_line.executeUpdate();
            }
            connection.commit();
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            result = 1;
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author USER
 */
public class ProductDAO extends DBContext {

    public ArrayList<Product> getAllproduct() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "SELECT [id]\n"
                    + "      ,[name]\n"
                    + "      ,[type]\n"
                    + "      ,[price]\n"
                    + "      ,[img]\n"
                    + "      ,[sale]\n"
                    + "  FROM [dbo].[Product]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setType(rs.getString(3));
                p.setPrice(rs.getInt(4));
                p.setImg(rs.getString(5));
                if (rs.getInt(6) == 1) {
                    p.setSale(true);
                } else {
                    p.setSale(false);
                }
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public ArrayList<Product> getAllproductBySearch(String s, int pageindex, int pagesize) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "SELECT * FROM\n"
                    + "   (SELECT *,ROW_NUMBER() OVER (ORDER BY ID ASC) as row_num FROM  Product where name like ?) as tblProduct\n"
                    + "     WHERE row_num >= (? - 1)*? +1 AND row_num<= ? * ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(2, pageindex);
            statement.setInt(3, pagesize);
            statement.setInt(4, pageindex);
            statement.setInt(5, pagesize);
            statement.setString(1, "%" + s + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setType(rs.getString(3));
                p.setPrice(rs.getInt(4));
                p.setImg(rs.getString(5));
                if (rs.getInt(6) == 1) {
                    p.setSale(true);
                } else {
                    p.setSale(false);
                }
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public Product getProductById(int id) {
        Product p = new Product();
        try {
            String sql = "SELECT [id]\n"
                    + "      ,[name]\n"
                    + "      ,[type]\n"
                    + "      ,[price]\n"
                    + "      ,[img]\n"
                    + "      ,[sale]\n"
                    + "  FROM [dbo].[Product] where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setType(rs.getString(3));
                p.setPrice(rs.getInt(4));
                p.setImg(rs.getString(5));
                if (rs.getInt(6) == 1) {
                    p.setSale(true);
                } else {
                    p.setSale(false);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    public ArrayList<Product> getAllMenproduct(int pageindex, int pagesize) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "SELECT * FROM\n"
                    + "   (SELECT *,ROW_NUMBER() OVER (ORDER BY ID ASC) as row_num FROM  Product where type = 'men') as tblProduct\n"
                    + "     WHERE row_num >= (? - 1)*? +1 AND row_num<= ? * ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, pageindex);
            statement.setInt(2, pagesize);
            statement.setInt(3, pageindex);
            statement.setInt(4, pagesize);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setType(rs.getString(3));
                p.setPrice(rs.getInt(4));
                p.setImg(rs.getString(5));
                if (rs.getInt(6) == 1) {
                    p.setSale(true);
                } else {
                    p.setSale(false);
                }
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public ArrayList<Product> getAllWomenproduct(int pageindex, int pagesize) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "SELECT * FROM\n"
                    + "   (SELECT *,ROW_NUMBER() OVER (ORDER BY ID ASC) as row_num FROM  Product where type = 'women') as tblProduct\n"
                    + "     WHERE row_num >= (? - 1)*? +1 AND row_num<= ? * ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, pageindex);
            statement.setInt(2, pagesize);
            statement.setInt(3, pageindex);
            statement.setInt(4, pagesize);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setType(rs.getString(3));
                p.setPrice(rs.getInt(4));
                p.setImg(rs.getString(5));
                if (rs.getInt(6) == 1) {
                    p.setSale(true);
                } else {
                    p.setSale(false);
                }
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public ArrayList<Product> getAllSaleproduct(int pageindex, int pagesize) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "SELECT * FROM\n"
                    + "   (SELECT *,ROW_NUMBER() OVER (ORDER BY ID ASC) as row_num FROM  Product where sale = 1) as tblProduct\n"
                    + "     WHERE row_num >= (? - 1)*? +1 AND row_num<= ? * ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, pageindex);
            statement.setInt(2, pagesize);
            statement.setInt(3, pageindex);
            statement.setInt(4, pagesize);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setType(rs.getString(3));
                p.setPrice(rs.getInt(4));
                p.setImg(rs.getString(5));
                if (rs.getInt(6) == 1) {
                    p.setSale(true);
                } else {
                    p.setSale(false);
                }
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public int countMen() {
        String sql = "SELECT COUNT(*) as rownum FROM Product where type = 'men'";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("rownum");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }

    public int countWomen() {
        String sql = "SELECT COUNT(*) as rownum FROM Product where type = 'women'";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("rownum");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }

    public int countSale() {
        String sql = "SELECT COUNT(*) as rownum FROM Product where sale = 1";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("rownum");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }

    public int countSearch(String s) {
        String sql = "SELECT COUNT(*) as rownum FROM Product where name like ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + s + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("rownum");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }
}

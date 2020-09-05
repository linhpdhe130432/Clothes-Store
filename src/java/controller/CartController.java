/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Order;
import model.OrderLine;
import model.Product;
import model.User;

/**
 *
 * @author USER
 */
public class CartController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            response.sendRedirect("login");
        } else {
            Order order = (Order)request.getSession().getAttribute("cart");
            if(order == null){
                order = new Order();
                request.getSession().setAttribute("cart", order);
            }
            request.getRequestDispatcher("cart.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Order order = (Order) request.getSession().getAttribute("cart");
        if (order == null) {
            order = new Order();
        }
        int pid = Integer.parseInt(request.getParameter("pid"));
        ProductDAO productDB = new ProductDAO();
        Product product = productDB.getProductById(pid);
        int indexOfExistingProduct = -1;
        for (int i = 0; i < order.getLines().size(); i++) {
            OrderLine line = order.getLines().get(i);
            if (line.getProduct().getId() == pid) {
                indexOfExistingProduct = i;
                break;
            }
        }
        if (indexOfExistingProduct != -1) {
            OrderLine line = order.getLines().get(indexOfExistingProduct);
            line.setQuantity(line.getQuantity() + 1);
        } else {
            OrderLine line = new OrderLine();
            line.setProduct(product);
            line.setOrder(order);
            line.setPrice(product.getPrice());
            line.setQuantity(1);
            order.getLines().add(line);
        }
        request.getSession().setAttribute("cart", order);
        response.sendRedirect("product?id=" + pid);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

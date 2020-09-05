/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Order {

    private int id;
    private Date date;
    private User customer;
    
    private ArrayList<OrderLine> lines = new ArrayList<>();
    
    public int total()
    {
        int sum = 0;
        for (OrderLine line : lines) {
            sum += line.total();
        }
        return sum;
    }
    

    public ArrayList<OrderLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<OrderLine> lines) {
        this.lines = lines;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }
}

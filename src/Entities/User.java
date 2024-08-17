package Entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private Integer userId;

    public Order_History getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(Order_History orderHistory) {
        this.orderHistory = orderHistory;
    }

    private Order_History orderHistory;

    public User(String userName, Integer userId,double bnpl_amount) {
        this.userName = userName;
        this.userId = userId;
        this.bnpl_amount = bnpl_amount;
        this.orderHistory = new Order_History(new ArrayList<>());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("userName='").append(userName).append('\'');
        sb.append(", userId=").append(userId);
        sb.append(", orderHistoryList=").append(orderHistory);
        sb.append('}');
        return sb.toString();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public double getBnpl_amount() {
        return bnpl_amount;
    }

    public void setBnpl_amount(double bnpl_amount) {
        this.bnpl_amount = bnpl_amount;
    }

    private double bnpl_amount;

    public void view_dues(){

    }


}

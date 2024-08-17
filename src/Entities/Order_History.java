package Entities;

import java.util.List;

public class Order_History {
    private List<Order> orders;

    public Order_History(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

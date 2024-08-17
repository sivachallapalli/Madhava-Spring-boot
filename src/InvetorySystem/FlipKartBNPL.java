package InvetorySystem;

import Entities.Order;
import Entities.Product;
import Entities.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlipKartBNPL {

    public static void main(String args[]){
        Product p1= new Product(1,"T_shirt",100,10);
        Product p2 = new Product(2,"Cap",70,10);
        Product p3 = new Product(3,"Short",90,10);
        Inventory inventory = new Inventory();
        inventory.seed_inventory(p1);
        inventory.seed_inventory(p2);
        inventory.seed_inventory(p3);
        inventory.view_inventory();
        User user = new User("Kishore",1,3600);
        User user2 = new User("ak",2,2400);
        RegisteredUsers registeredUsers = new RegisteredUsers();
        registeredUsers.registerUser(user);
        registeredUsers.registerUser(user2);
        Order order = new Order(user,new ArrayList<Product>(List.of(new Product[]{
                new Product(1, "T_shirt", 100, 1)
        })),"BNPL", new Date());
        System.out.println(user.getBnpl_amount());
        inventory.addToOrderHistory(user,order);
        System.out.println(user.getOrderHistory().getOrders().get(0));

    }
}

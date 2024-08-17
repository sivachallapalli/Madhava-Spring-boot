package InvetorySystem;

import Entities.Order;
import Entities.Order_History;
import Entities.Product;
import Entities.User;

import java.util.*;

public class Inventory {
    private List<Product> productsList;

    public Inventory(){
        this.productsList=new ArrayList<>();
    }
    public void seed_inventory(Product product){
       productsList.add(product);
    }

    public void view_inventory(){
        System.out.println("Product Item list is");
        System.out.println
                ("ProductId" + " "+"ProductName" + " ProductQuantity"+ " "+
                        "ProductPrice");
        for (Product product:productsList){
            if(product.getQuantity()==0){
                productsList.remove(product);
            } else{
                System.out.println(product.getProductId() +" "+product.getName()+ " "+product.getQuantity()+
                        " "+product.getPrice());
            }
        }

    }
    public void addToOrderHistory(User user, Order order){
        user.getOrderHistory().getOrders().add(order);
    }


}

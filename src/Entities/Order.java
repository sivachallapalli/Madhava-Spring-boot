package Entities;

import java.util.Date;
import java.util.List;

public class Order {
    private User user;

    public Order(User user, List<Product> productList, String paymentMethod, Date dateOfPurchase) {
        this.user = user;
        this.productList = productList;
        this.paymentMethod = paymentMethod;
        this.dateOfPurchase = dateOfPurchase;
        decreaseLimit(user.getBnpl_amount());
    }

    private List<Product> productList;
    private String paymentMethod;

    private Date dateOfPurchase;

    public void decreaseLimit(Double bnpl_amount){
        if(paymentMethod.equals("BNPL")){
            double sum=0;
            for(Product p:productList){
                sum=sum+p.getQuantity()*p.getPrice();
            }
            user.setBnpl_amount(user.getBnpl_amount()-sum);
        }
    }
}

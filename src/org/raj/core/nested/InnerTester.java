package org.raj.core.nested;

/**
 * Created by rjk on 11/1/2016.
 */
public class InnerTester {
    public static void main(String args[]){
        ProductInner productInner = new ProductInner();
        System.out.println(productInner.getOrderId());

        ProductInner.Order order = (new ProductInner()). new Order();
        System.out.println(order.getOrderId());
       // ProductInner.Order.printMe();
        order.printMe();

    }
}

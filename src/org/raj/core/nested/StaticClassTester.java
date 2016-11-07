package org.raj.core.nested;

/**
 * Created by rjk on 11/1/2016.
 */
public class StaticClassTester {
    public static void main(String args[]){
        ProductStatic productStatic = new ProductStatic();
        System.out.println(productStatic.getOrderId());

        ProductStatic.Order order = new ProductStatic.Order();
        System.out.println(order.getOrderId());
        ProductStatic.Order.printMe();

    }
}

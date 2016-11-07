package org.raj.core.nested;

/**
 * Created by rjk on 11/1/2016.
 */
public class ProductStatic {
    private int id;
    private String name;

    public static class Order{
        public long orderId;
        private String orderDate;
        private String type;
        public long getOrderId(){
            return orderId;
        }
        public void setOrderId(long orderId){
            this.orderId = orderId;
        }
        public static void printMe(){
            System.out.println("This is from static nested class : Order");
        }
    }

    public long getOrderId(){
        ProductStatic.Order product = new ProductStatic.Order();
        product.setOrderId(10L);
        return  product.getOrderId();
    }

//    public long getOrderId(){
//        return Product.Order.
//    }


}

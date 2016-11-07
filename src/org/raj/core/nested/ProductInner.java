package org.raj.core.nested;

/**
 * Created by rjk on 11/1/2016.
 */
public class ProductInner {
    private int id;
    private String name;

    public class Order{
        public long orderId;
        private String orderDate;
        private String type;
        public long getOrderId(){
            return orderId;
        }
        public void setOrderId(long orderId){
            this.orderId = orderId;
        }
        //inner classes cannot have static methods, variables
        public  void printMe(){
            System.out.println("This is from inner member class : Order");
        }
    }

    public long getOrderId(){
        ProductStatic.Order product = new ProductStatic.Order();
        product.setOrderId(10L);
        return  product.getOrderId();
    }
}

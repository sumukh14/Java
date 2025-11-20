package Object;
import java.lang.*;
class OutOfStockException extends Exception{
    public  OutOfStockException(String message) {
        super(message);
    }
}

public class OnlineShoppingSystem {
//    int num = 8;
    public static void calculateStock(int availableStock, int requiredStock) throws OutOfStockException{
        if(availableStock < requiredStock){
            throw new OutOfStockException("Out of stock! Product is not available");
        }else {
            System.out.println("Product is available");
            System.out.println("Current Stock: "+availableStock);
            System.out.println("Confirm Order: "+requiredStock);
            System.out.println("Updated Stock: "+(availableStock-requiredStock));
        }
    }

    public static void main(String[] args) {
        try {
            calculateStock(130,55);
//            calculateStock(55);
        }catch (OutOfStockException e){
            System.out.println("Error"+ e.getMessage());
        }
    }
}

import java.util.*;
public class q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unitPrice, quantity;
        System.out.print("Enter unit price: ");
        unitPrice = input.nextInt();
        System.out.print("Enter the quntity: ");
        quantity = input.nextInt();
        int totalPrice = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %d if the quantity %d and unit price is INR is %d",totalPrice,unitPrice,quantity);

    }
}

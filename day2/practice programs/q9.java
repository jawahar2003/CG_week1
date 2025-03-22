import java.util.*;
public class q9 {
    public static void main(String[] args) {
        float fee,discountPercent;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee amount: ");
        fee = input.nextInt();
        System.out.print("Enter disocunt percent: ");
        discountPercent = input.nextInt();
        float discountAmount = fee * (discountPercent/100);
        float discountedFee= fee - discountAmount;
        System.out.printf("The discount amount in INR "+discountAmount+" and the final discounted fee in INR is: "+discountedFee);
    }
}

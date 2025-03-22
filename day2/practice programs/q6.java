public class q6 {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        float discount = fee * discountPercent / 100;
        float finalFee = fee - discount;
        System.out.println("The discount amount in INR "+ discount + " and the final discounted fee  in INR is "+finalFee);
    }    
}

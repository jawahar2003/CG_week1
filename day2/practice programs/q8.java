import java.util.*;
public class q8 {
    public static void main(String[] args) {
        int km;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter km to convert to miles: ");
        km = input.nextInt();
        double miles = (1/1.6) * km;
        System.out.println("The total miles is "+miles+" for the given"+km+"km");
    }
}

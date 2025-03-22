import java.util.*;
public class q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Height: ");
        float height = input.nextFloat();
        System.out.print("Enter base: ");
        float base = input.nextFloat();
        double area = (0.5) * base * height;
        System.out.printf("The area of Triangle for height %.2f and base %.2f is %.2f",height,base,area);
    }
}

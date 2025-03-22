import java.util.*;
public class q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lenght of the side: ");
        int side = input.nextInt();
        int perimeter = side * 4;
        System.out.printf("The lenght of the side is %d  whose perimeter is %d",side, perimeter);
    }
}

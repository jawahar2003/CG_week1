import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you height in cm: ");
        int cm = input.nextInt();
        int foot = (int)(cm/(12*2.54));
        int inches = (int) ((cm / 2.54) % 12);
        System.out.printf("Your Height in cm is %d while in feet is %d and inches %d", cm, foot, inches);
    }
}
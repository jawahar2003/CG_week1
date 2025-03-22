import java.util.*;
public class q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b;
        System.out.println("Enter a: ");
        a = input.nextFloat();
        System.out.println("Enter b: ");
        b = input.nextFloat();
        float add = a + b;
        float sub = a - b;
        float mul = a * b;
        float div = a / b;
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %f and %f is %f, %f, %f, and %f",a,b,add,sub,mul,div);
    }
}

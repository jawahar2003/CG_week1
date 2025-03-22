import java.util.Scanner;

public class Practice_problems {
    public static void main(String args[]){

        System.out.println(simpleIntrest());
        System.out.println(perimeterOfRectangle());
        System.out.println(averageOfThree());
        System.out.println(kmToMiles());
        System.out.println(powerCalculation());
    }   
    
    static double simpleIntrest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        float principal = sc.nextFloat();
        System.out.print("Enter time: ");
        float time = sc.nextFloat();
        System.out.print("Enter the rate: ");
        float rate = sc.nextFloat();
        sc.close();
        return  (principal * rate * time) / 100;
    }

    static double perimeterOfRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter the width: ");
        int width = sc.nextInt();
        sc.close();
        return  2 * (length* width);
    }

    static double kmToMiles(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the km: ");
        int km = sc.nextInt();
        sc.close();
        return km * 0.621371;
    }

    static float averageOfThree(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers seperated by space: ");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        sc.close();
        float avg = (a+b+c)/3;
        return avg;
    }

    static double powerCalculation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int base = sc.nextInt();
        System.out.println("Enter power:");
        int power = sc.nextInt();
        sc.close();
        return Math.pow(base,power);
    }
}

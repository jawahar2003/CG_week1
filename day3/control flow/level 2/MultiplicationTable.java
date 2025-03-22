// import java.util.*;
// public class q1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter two number seperated by space: ");
//         double a = input.nextInt();
//         double b = input.nextInt();
//         double quotient = a / b;
//         double remainingChocolates = a % b;
//         System.out.println("The Quotient is "+quotient+" and Remainder is "+remainingChocolates+" of two number "+a+" and "+b);
        
//     }
// }

// import java.util.*;
// public class q1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter three number seperated by space: ");
//         double a = input.nextInt();
//         double b = input.nextInt();
//         double c = input.nextInt();

//         double result1 = a + b * c;
//         double result2 = a * b + c;
//         double result3 = c + a / b;
//         double result4 = a % b + c;

//         System.out.println("Result of a + b * c: " + result1);
//         System.out.println("Result of a * b + c: " + result2);
//         System.out.println("Result of c + a / b: " + result3);
//         System.out.println("Result of a % b + c: " + result4);
        
//     }
// }

// import java.util.*;
// public class q1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter three number seperated by space: ");
//         double a = input.nextInt();
//         double b = input.nextInt();
//         double c = input.nextInt();

//         double result1 = a + b * c;
//         double result2 = a * b + c;
//         double result3 = c + a / b;
//         double result4 = a % b + c;

//         System.out.println("Result of a + b * c: " + result1);
//         System.out.println("Result of a * b + c: " + result2);
//         System.out.println("Result of c + a / b: " + result3);
//         System.out.println("Result of a % b + c: " + result4);
        
//     }
// }

// import java.util.*;
// public class q1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter fahrenheit: ");
//         double fahrenheit = input.nextDouble();
//         double celsius = (fahrenheit - 32) * 5/9;
//         System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius");
//     }
// }

// import java.util.*;
// public class q1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter Salary: ");
//         int salary = input.nextInt();
//         System.out.print("Enter bonus: ");
//         int bonus = input.nextInt();
//         int totalSalary = salary + bonus ;
//         System.out.println("The salary in INR "+salary+" and bonus in INR "+bonus+"H ence the total income in INR is "+totalSalary);

//     }
// }

// import java.util.*;
// public class q1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter two numbers separated by space: ");
//         int a = input.nextInt();
//         int b = input.nextInt();

//         a = a + b;
//         b = a - b;
//         a = a - b;

//         System.out.println("The swapped number are "+a+" and "+b);

//     }
// }

// import java.util.*;
// public class q1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = input.nextLine();
        
//         System.out.print("Enter the from city: ");
//         String fromCity = input.nextLine();
        
//         System.out.print("Enter the via city: ");
//         String viaCity = input.nextLine();
        
//         System.out.print("Enter the to city: ");
//         String toCity = input.nextLine();
        
//         System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in km: ");
//         double distanceFromToVia = input.nextDouble();
        
//         System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: ");
//         int timeFromToVia = input.nextInt();
        
//         System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in km: ");
//         double distanceViaToFinalCity = input.nextDouble();
        
//         System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: ");
//         int timeViaToFinalCity = input.nextInt();
//         double totalDistance = distanceFromToVia + distanceViaToFinalCity;
//         int totalTime = timeFromToVia + timeViaToFinalCity;
//         System.out.println("The Total Distance travelled by " + name + " from " + 
//         fromCity + " to " + toCity + " via " + viaCity +
//         " is " + totalDistance + " km and " +
//         "the Total Time taken is " + totalTime + " minutes");
//     }
// }

// import java.util.*;
// public class q1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the side 1: ");
//         int side1 = input.nextInt();
//         System.out.println("Enter the side 2: ");
//         int side2 = input.nextInt();
//         System.out.println("Enter side 3: ");
//         int side3 = input.nextInt();
//         float perimeter = side1 + side2 + side3;
//         float totalRounds = 5/perimeter;
//         System.out.println("The total number of rounds the athlete will run is "+totalRounds+" to complete 5 km");
//     }
// }


// import java.util.*;
// public class q1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter numberOfchocolates: ");
//         int numberOfchocolates = input.nextInt();
//         System.out.print("Enter numberOfChildren: ");
//         int numberOfChildren = input.nextInt();
//         int chocolatesPerChildren = numberOfchocolates / numberOfChildren;
//         int remainingChocolates = numberOfchocolates % numberOfChildren;
//         System.out.println("The number of chocolates each child gets is "+chocolatesPerChildren+" and the number of remaining chocolates are "+ remainingChocolates);

//     }
// }


// import java.util.*;
// public class q1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//     System.out.print("Enter Principal: ");
//     double principal = input.nextDouble();
//     System.out.print("Enter Rate of Interest: ");
//     double rate = input.nextDouble();
//     System.out.print("Enter Time: ");
//     double time = input.nextDouble();

//     double simpleInterest = (principal * rate * time) / 100;

//     System.out.println("The Simple Interest is "+simpleInterest+"for Principal"+principal+"Rate of Interest "+rate+" and Time "+time);

//     }
// }

// import java.util.*;
// public class q1{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int number = input.nextInt();
//     boolean ans = number % 5 == 0;
  
//         System.out.println("The number " + number + " is divisible by 5?: " + ans);

//     }
// }

// import java.util.*;
// public class q1{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter three number seperated by space: ");
//         int a = input.nextInt();
//         int b = input.nextInt();
//         int c = input.nextInt();

//         boolean isfirstLargest = (a>b && a>c);
//         System.out.println("Is the first number the smallest?: "+ isfirstLargest);
//         boolean isSecondLargest = (b>a && b>c);
//         System.out.println("Is the second number the smallest?: "+ isSecondLargest);
//         boolean isThirdLargest = (c>b && c>b);
//         System.out.println("Is the first number the smallest?: "+ isThirdLargest);
//     }
// }
    

import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

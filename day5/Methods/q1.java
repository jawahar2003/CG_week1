import java.util.*;
public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int number = sc.nextInt();
        int[] factorsArray = factorsOfNumber(number);
        int sum = sumOfFactors(factorsArray);
        int product = productOfFactors(factorsArray);
        int sumOfSquare = sumOfSquare(factorsArray);
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
        System.out.println("Sum of Square: "+sumOfSquare);
        System.out.println(Arrays.toString(factorsArray));



    }

    static int[] factorsOfNumber(int number){
        int originalNumber = number;
        int count = 0;
        for(int i=1;i<=number; i++){
            if(number%i==0){

                count++;
            }
        }

        int[] factorsArray = new int[count];
        int index = 0;
        for(int i=1;i<=number;i++){
            if(originalNumber%i==0){

                factorsArray[index] = i;
                index++;
            }
        }

        return factorsArray;

    }

    static int sumOfFactors(int[] factorsArray){
        int sum = 0;
        for(int i=0;i<factorsArray.length;i++){
            sum += factorsArray[i];
        }
        return sum;
    }

    static int productOfFactors(int[] factorsArray){
        int product = 1;
        for(int i=0;i<factorsArray.length;i++){
            product *= factorsArray[i];
        }
        return product;
        
    }

    static int sumOfSquare(int[] factorsArray){
        int sum = 0;
        for(int i=0;i<factorsArray.length;i++){
          sum += Math.pow(factorsArray[i],2);
        }
        return sum;
    }
}
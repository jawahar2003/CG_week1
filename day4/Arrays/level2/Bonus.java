import java.util.*;

public class Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        System.out.println("With recursion: "+sumOfNaturalNUmber(number));
        System.out.println("With formula: "+naturalNumberSum(number));
        

    }

    static int sumOfNaturalNUmber(int n){
        if(n<0){
            return 0;
        }
        return n + sumOfNaturalNUmber(n-1);
    }

    static int naturalNumberSum(int n){
        int result = (n * (n+1))/2;
        return result;
    }

    
}

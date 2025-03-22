import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = sc.nextInt();
        System.out.println(leapOrNot(year));


    }
    static boolean leapOrNot(int year){
        if(year % 400 ==0 || (year % 100 !=0 && year % 4 ==0)){
            return true;
        }
        return false;
    }
}

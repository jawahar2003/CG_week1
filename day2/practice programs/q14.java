import java.util.*;
public class q14 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter feet: ");
        int totalFeet = input.nextInt();
        int yards = totalFeet/3;
        int miles = yards/1760;
        int remainingYards = yards % 1760;
        System.out.printf("%d Foot is %d miles and %d yards",totalFeet,miles,remainingYards);

    }
}

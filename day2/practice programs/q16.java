import java.util.*;
public class q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int totalHandShakes = (numberOfStudents * (numberOfStudents -1 )) / 2;
        System.out.println("The total number of hand shakes for"+ numberOfStudents +" students : "+totalHandShakes);
    }
}

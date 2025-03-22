public class q5 {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int pensPerStudent = pens / students;
        int pensLeft = pens % students;
        System.out.println("The Pen Per student is: "+pensPerStudent+" and the remaining Pen not distributed is: "+pensLeft);
    }    
}

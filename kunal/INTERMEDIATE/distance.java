import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter x2 and y2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        // Calculate the distance using the distance formula
        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
        
        // Print the distance
        System.out.println("Distance is " + distance);
        
        // Print the formula for the square root of 10
        //System.out.println("The square root of 10 is represented as sqrt(10)");
    }
}

import java.util.*;

class Main {
    public static void main(String[] args) {
        String name = "NAREN";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter name:");
        String inputName = scanner.next();
        
        if (name.equals(inputName)) {
            System.out.println("Names are equal.");
        } else { // Use else directly after if, no need for else if here
            System.out.println("Names are not equal.");
        }
    }
}

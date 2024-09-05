import java.util.*;
public class Vowel_Consonant {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        char a=sc.next().charAt(0);
        char ch=Character.toUpperCase(a);
        switch (ch) {
            case 'A' -> System.out.println("VOLWEL");
            case 'E' -> System.out.println("VOLWEL");
            case 'I' -> System.out.println("VOLWEL");
            case 'O' -> System.out.println("VOLWEL");
            case 'U' -> System.out.println("VOLWEL");
            default -> System.out.println("consonant");    
        }  
    sc.close();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        // list.add(88);
        // list.add(88);
        // list.add(88);
        // list.add(88);
        // System.out.println(list);
        // list.contains(65);
        // list.set(1,11);
        // System.out.println(list);
        // list.remove(2);
        // System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
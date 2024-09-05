import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import org.xml.sax.HandlerBase;

/**
 * removeduplicates
 */
public class removeduplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,1,2,3,5,4,8,5,4,8,0};

        HashSet<Integer> li= new HashSet<>();

        for(int num : arr){
            li.add(num);
        }
        System.out.println(li);
    }
}p
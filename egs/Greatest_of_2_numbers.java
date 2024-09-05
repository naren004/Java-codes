import java.util.*;

class Greatest_of_2_numbers {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int num1=a.nextInt();
        int num2=a.nextInt();
        if (num1>num2){
            System.out.println(+num1 +" is greater");
        }
        else if(num1==num2){
            System.out.println("its equal");
        }
        else{
            System.out.println("num 2 is greater");
        }
    }
}
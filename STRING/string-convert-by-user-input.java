import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in)
	    System.out.println("enter a Character");
	    char ch=sc.next().charAt(0);
	    if((ch>=97 && ch<=122) || (ch>=65 && ch<=90))
	    {
	        if(ch>=97 && ch<=122){
	        System.out.println((char)(ch+32));
	    }
	    else(ch>=65 && ch<=90){
	        System.out.println((char)(ch-32));
	    }
	    else{
	        System.out.println("enter a valid");
	    }
	}
}

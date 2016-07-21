import java.util.Scanner;
public class Activity4 {
public static void main(String[] args) {
	int i,n,fact=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
    n=s.nextInt();	
    for(i=1;i<=n;i++)
    {
    	fact=fact*i;
    }
    System.out.println("the factorial is"+fact);

	}

}

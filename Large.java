import java.util.Arrays;
import java.util.Scanner;
public class Large{

	public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Length");
	int n=sc.nextInt();
	int[] A= new int[n];
	int i,temp;
	System.out.println("Enter elements");
	for (i=0;i<n;i++){
		temp=sc.nextInt();
		A[i]=temp;
	}
	Arrays.sort(A);
	System.out.println(A[n-2]);
}
}

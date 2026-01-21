package Array;
import java.util.*;
public class Sum_Of_4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[]= new int[4];
		int arr1[]=new int[5];
		int sum=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			System.out.print("Enter Element at arr["+i+"] = ");
			arr[i]=sc.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
			sum+=arr[i];
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
		}
		System.out.println("Sum : "+ sum);
		System.out.println("Min : "+ min);
		System.out.println("Max : "+ max);
		System.out.println("Enter 5 numbers ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print("Enter Element at arr1["+i+"] = ");
			arr1[i]=sc.nextInt();
		}
		for (int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				System.out.println(arr1[i]);
			}
		}
	}
}

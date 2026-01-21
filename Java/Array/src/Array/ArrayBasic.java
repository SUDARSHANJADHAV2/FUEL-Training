package Array;
import java.util.*;
public class ArrayBasic {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr1[] = {10,20,30,40,50};
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Array at arr1["+i+"] = "+arr1[i]);
		}
		int arr2[]=new int[4];
		for(int i=0;i<arr2.length;i++) {
			System.out.print("Enter the element to add at arr2["+i+"] : ");
			arr2[i]=sc.nextInt();		
		}
		for(int i =0;i<arr2.length;i++){
			System.out.println("Array at arr2["+i+"] = "+arr2[i]);
		}
	}

}

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
		int[] arr = {1,4,3,2,6,5,7,8,10,9,11};
		
		System.out.println("Enter element to be searched:");
		Scanner s = new Scanner(System.in);
		int key = s.nextInt();
		int c=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				c=1;
				break;
			}
		}
		
		if(c==1) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
			
	}
}

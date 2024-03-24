

public class Arrayeg {
	public static void main(String[] args) {
		int[] array1 = new int[10];
		int []array2 = new int[5];
		int []array3 = {1,2,3,4,5,6,7,8,9,10};
		
		String[] words = {"Hello","World"};
		
		//System.out.println(array3[1]);
		
		
		System.out.println("Traditional for loop:");
		for(int i=0;i< array3.length;i=i+2) {
			System.out.println(array3[i]);
			//array2[i]=array3[i];
		}
		
		System.out.println("reverse:");
		for(int i=array3.length-1;i>=0;i--) {
			System.out.println(array3[i]);
		}
		
		
		System.out.println("even nos from 0 to 100:");
		for(int i=0;i<101;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Largest number in array:");
		int lg=array3[0];
		for(int i=array3.length-1;i>=0;i--) {
			if(array3[i]>lg) {
				lg=array3[i];
			}
		}
		System.out.println(lg);
		
		//System.out.println("For each loop");
		for(int a : array2) {
			//System.out.println(a);
		}
		
	}
}

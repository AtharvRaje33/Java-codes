
public class RaggedArray {
	public static void main(String[] args) {
		int[][] ir_array = new int [3][];
		
		ir_array[0] = new int[5];
		ir_array[1] = new int[3];
		ir_array[2] = new int[2];
		
		for (int i = 0; i < 5; i++) {
		    ir_array[0][i] = (i+1)*10;
		}

		for (int i = 0; i < 3; i++) {
		    ir_array[1][i] = (i+1)*11;
		}

		for (int i = 0; i < 2; i++) {
		    ir_array[2][i] = (i+1)*12;
		}
		
		System.out.println("ir_array[0][4] = " + ir_array[0][4]);
		System.out.println("ir_array[1][2] = " + ir_array[1][2]);
		System.out.println("ir_array[2][1] = " + ir_array[2][1]);
		
		
		for (int ai = 0;ai < ir_array.length;ai++) {
			for (int adi = 0;adi < ir_array[ai].length;adi++) {
			        System.out.print(ir_array[ai][adi]+" ");
			    }
			    //System.out.println("");
			}
		
	}
}

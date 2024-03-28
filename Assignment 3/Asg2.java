public class Asg2 {
	public static void main(String[] args) {
		
		int largestNumber = Integer.parseInt(args[0]);

        for (String arg : args) {
            int currentNumber = Integer.parseInt(arg);
            if (currentNumber > largestNumber) {
                largestNumber = currentNumber;
            }
        }
        System.out.println("Largest number is:"+largestNumber);
		
		
		/*for (String name : args) {
             System.out.println("Student Name: " + name);
         }*/
		
		/*int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
		
		  int sum = num1 + num2;
          int difference = num1 - num2;
          
          System.out.println("Sum: " + sum);
          System.out.println("Difference: " + difference);/*
        
		
		
		
		//System.out.println("Entered message: " + args[0]);
		
		
		//System.out.println("This is a message");
		
		/*System.out.println("""
				This is a
				multiline
				message""");*/
	
		
		           
		    
		}

	
}




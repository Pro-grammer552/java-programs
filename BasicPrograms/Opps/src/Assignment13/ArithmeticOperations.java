package Assignment13;

public class ArithmeticOperations {
	    int num1=10 ;
       int num2 =20;
     
     public void ArithmeticOperations(int num1,int num2)
     {
    	 this.num1=num1;
         this.num2=num2;
     }
     

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {

    	return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
       
            return  a / b;
       
        }
    
    public static void main(String[] args) {
       
   	ArithmeticOperations ao=new ArithmeticOperations();
   	ao.add(10,20);
    	
//        int additionResult = add(num1, num2);
//        int subtractionResult = subtract(num1, num2);
//        int multiplicationResult = multiply(num1, num2);
//        double divisionResult = divide(num1, num2);
//
//        System.out.println("Addition: " + additionResult);
//        System.out.println("Subtraction: " + subtractionResult);
//        System.out.println("Multiplication: " + multiplicationResult);
//        System.out.println("Division: " + divisionResult);
  } 
    
    
    
}


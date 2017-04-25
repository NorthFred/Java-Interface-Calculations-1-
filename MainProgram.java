
public class MainProgram {

    public static void main(String[] args) {
        
        /*
           1) Using interfaces with the classic method.
        */
        
        // Create object from the A class, which implements the interface
        ClassCalculations calculation1 = new ClassCalculations();
        
        int a = 10; 
        int b = 20; 
        int result;
        
        result = calculation1.addvalues(a, b);
        System.out.println("Sum of " + a + " and " + b + " = " + result);
        
        result = calculation1.multiplyvalues(a, b);
        System.out.println("Product of " + a + " and " + b + " = " + result);
        
    } 
}

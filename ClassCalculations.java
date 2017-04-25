
// This class implements the Interface A
public class ClassCalculations implements InterfaceCalculations {
    
    // Public method returns an integer value
    @Override
    public int addvalues(int a, int b) {
        
        return (a+b);
    }
    
    @Override
    public int multiplyvalues(int a, int b) {
        
        return (a*b);
    }
}

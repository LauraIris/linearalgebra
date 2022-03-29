package linearalgebra.src;

public class Printer {
    public void printVector(String name, Vector vector){
        System.out.println(name+" = "+vector.toString());
    }
    
    public void print(String var, Object object){
        System.out.println(var+" = "+object);
    }
    
    public void printScalar(String var, double product){
        System.out.println("|"+var+"| = "+product);
    }
}

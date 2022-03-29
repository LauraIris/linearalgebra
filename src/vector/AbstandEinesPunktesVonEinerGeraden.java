package linearalgebra.src.vector;

import linearalgebra.src.Printer;
import linearalgebra.src.Vector;

public class AbstandEinesPunktesVonEinerGeraden {
    private Printer printer = new Printer();
    
    
    public void viaParallelogram(){
        Vector a= new Vector(new double[]{3,5,-4});
        printer.printVector("a",a);
        Vector PA=new Vector(new double[]{2,-14,9});
        printer.printVector("PA", PA);
        Vector a_PA = a.cross(PA);
        printer.printVector("a x PA",a_PA);
        double a_PA_scalar = a_PA.magnitude();
        printer.printScalar("a x PA",a_PA_scalar);
        double a_scalar = a.magnitude();
        printer.printScalar("a", a_scalar);
        double l = a_PA_scalar/a_scalar;
        printer.print("Solution -> l",l);
    }
    
}

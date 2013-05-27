package facultat.assignatures;

import facultat.Alumne;
import facultat.Assignatura;
import facultat.Quadrimestre;
import facultat.excepcions.AssignaturaOptativaDificultatBaixa;
import java.util.Date;

/**
 *
 * @author hector
 */
public class Optativa extends Assignatura
{
    private int dificultat;
    
    @Override
    public void matricular(Alumne al, Quadrimestre q, Date data)
    {
        if(al.teEstudisSuperiors() && teDificultatBaixa())
            throw new AssignaturaOptativaDificultatBaixa();
        
        super.matricular(al, q, data);
    }
    
    private boolean teDificultatBaixa() {
        return dificultat < 5;
    }
}

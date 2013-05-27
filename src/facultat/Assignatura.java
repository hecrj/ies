package facultat;

import facultat.excepcions.AssignaturaPlaTecnic;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hector
 */
abstract public class Assignatura
{
    private int codi;
    private int numCredits;
    private PlaEstudis plaEstudis;
    private List<Matricula> matricules;
    
    public void matricular(Alumne al, Quadrimestre q, Date data)
    {
        if(al.teEstudisSuperiors() && plaEstudis.esTecnic())
            throw new AssignaturaPlaTecnic();
        
        Matricula m = new Matricula(q, this, data);
        
        al.afegirMatricula(m);
    }
    
    public int getCredits()
    {
        return numCredits;
    }
}

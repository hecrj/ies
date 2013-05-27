package facultat;

import facultat.excepcions.MaximCreditsAssolit;
import facultat.excepcions.MaximMatriculesAssignaturaAssolit;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hector
 */
public class Alumne
{
    private String dni;
    private TipusTitol estudis;
    
    private List<Matricula> matricules;
    
    public void matricular(Quadrimestre q, Assignatura as, Date data)
    {
        if(maximCreditsAssolit(q, as))
            throw new MaximCreditsAssolit();
        
        if(maximMatriculesAssignaturaAssolit(as))
            throw new MaximMatriculesAssignaturaAssolit();
        
        as.matricular(this, q, data);
    }
    
    private boolean maximCreditsAssolit(Quadrimestre q, Assignatura as)
    {
        int totalCredits = as.getCredits();
        
        for(Matricula mat : matricules)
            if(mat.teQuadrimestre(q))
                totalCredits += mat.getCredits();
        
        return totalCredits > 40;
    }
    
    private boolean maximMatriculesAssignaturaAssolit(Assignatura as)
    {
        int totalMatricules = 0;
        
        for(Matricula mat : matricules)
            if(mat.teAssignatura(as))
                totalMatricules++;
        
        return totalMatricules >= 6;
    }
    
    public boolean teEstudisSuperiors()
    {
        return estudis == TipusTitol.SUPERIOR;
    }
    
    public void afegirMatricula(Matricula m)
    {
        matricules.add(m);
    }
}

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
        
        Matricula m = new Matricula(q, as, data);
        matricules.add(m);
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
}

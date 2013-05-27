package facultat.assignatures;

import facultat.Alumne;
import facultat.Assignatura;
import facultat.Professor;
import facultat.Quadrimestre;
import facultat.excepcions.ProfessorPocQualificat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hector
 */
public class Obligatoria extends Assignatura
{
    private List<Professor> professors;
    
    @Override
    public void matricular(Alumne al, Quadrimestre q, Date data)
    {
        if(al.teEstudisSuperiors() && teProfessorTecnic())
                throw new ProfessorPocQualificat();
        
        super.matricular(al, q, data);
    }
    
    private boolean teProfessorTecnic() {
        for(Professor p : professors)
            if(p.esTecnic())
                return true;
        
        return false;
    }
}

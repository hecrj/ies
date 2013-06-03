package academia;

import java.util.List;

/**
 *
 * @author hector
 */
public class Persona
{
    private String dni;
    private String nom;
    private String titulacio;
    
    private List<Projecte> projectes;
    
    public boolean esParticipant(Projecte p)
    {
        return projectes.contains(p);
    }
    
    public boolean estaQualificada(Projecte p)
    {
        if(p.esArriscat())
            return titulacio.equals("enginyer");
        
        return true;
    }
    
    public void eliminarProjecte(Projecte p)
    {
        projectes.remove(p);
    }
}

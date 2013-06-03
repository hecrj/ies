package academia.inscripcions;

import academia.Inscripcio;
import academia.Persona;
import academia.Projecte;

/**
 *
 * @author hector
 */
public class Oient extends EstatInscripcio
{
    private Projecte projecte;
    
    public Oient(Inscripcio inscripcio, Projecte projecte)
    {
        super(inscripcio);
        this.projecte = projecte;
    }
    
    @Override
    public void ferOficial(Inscripcio inscripcio, Persona persona, Projecte nouProj)
    {
        Oficial oficial = new Oficial(inscripcio, nouProj);
        inscripcio.modificarEstat(oficial);
        
        persona.eliminarProjecte(projecte);
    }
}

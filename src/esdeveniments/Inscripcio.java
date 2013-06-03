package esdeveniments;

import esdeveniments.excepcions.HiHaOverbooking;
import esdeveniments.excepcions.InscripcioNoPrevista;
import esdeveniments.inscripcions.EstatInscripcio;
import java.util.Date;

/**
 *
 * @author hector
 */
public class Inscripcio
{
    private Date data;
    private EstatInscripcio estat;
    private Esdeveniment esdeveniment;
    
    public boolean esCancelada()
    {
        return estat.esCancelada();
    }
    
    public String getNomOrganitzadorEsdeveniment()
    {
        return esdeveniment.getNomOrganitzador();
    }
    
    public float getPuntuacio()
    {
        return estat.getPuntuacio();
    }
    
    public void confirmarAssistencia(boolean acompanyada) throws InscripcioNoPrevista, HiHaOverbooking
    {
        if(esdeveniment.esPle())
            throw new HiHaOverbooking();
        
        estat.confirmarAssistencia(acompanyada);
        
        esdeveniment.incrementarConfirmats();
    }
    
    public void modificarEstat(EstatInscripcio estat)
    {
        this.estat = estat;
    }
}

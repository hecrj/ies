package esdeveniments;

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
}

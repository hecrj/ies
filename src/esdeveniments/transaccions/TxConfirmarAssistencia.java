package esdeveniments.transaccions;

import esdeveniments.Inscripcio;
import esdeveniments.data.DataController;
import esdeveniments.excepcions.HiHaOverbooking;
import esdeveniments.excepcions.InscripcioNoExisteix;
import esdeveniments.excepcions.InscripcioNoPrevista;

/**
 *
 * @author hector
 */
public class TxConfirmarAssistencia
{
    private DataController dades;
    
    private String nomE;
    private String nomP;
    private boolean acomp;
    
    public void executar() throws InscripcioNoExisteix, InscripcioNoPrevista, HiHaOverbooking
    {
        Inscripcio inscripcio = dades.getInscripcio(nomE, nomP);
        
        inscripcio.confirmarAssistencia(acomp);
    }
}

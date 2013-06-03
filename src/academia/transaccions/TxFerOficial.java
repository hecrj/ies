package academia.transaccions;

import academia.Inscripcio;
import academia.Projecte;
import academia.data.DataController;
import academia.excepcions.CursPle;
import academia.excepcions.InscripcioNoOient;
import academia.excepcions.MassaOficialsCurs;
import academia.excepcions.MassaOficialsProjecte;
import academia.excepcions.NoExisteixInscripcio;
import academia.excepcions.NoExisteixProjecte;
import academia.excepcions.OficialNoEnginyer;
import academia.excepcions.OficialOient;
import academia.excepcions.PocsOients;

/**
 *
 * @author hector
 */
public class TxFerOficial
{
    private DataController dades;
    
    private String dniP;
    private String nomCurs;
    private String codiProj;
    
    public void executar()
            throws NoExisteixInscripcio, NoExisteixProjecte, CursPle, OficialOient, OficialNoEnginyer,
            InscripcioNoOient, PocsOients, MassaOficialsCurs, MassaOficialsProjecte
    {
        Inscripcio inscripcio = dades.getInscripcio(dniP, nomCurs);
        Projecte projecte = dades.getProjecte(codiProj);
        
        inscripcio.ferOficial(projecte);
    }
}

package facultat.transaccions;

import facultat.Alumne;
import facultat.Assignatura;
import facultat.Quadrimestre;
import facultat.data.DataController;
import facultat.excepcions.ExisteixMatricula;
import java.util.Date;

/**
 *
 * @author hector
 */
public class TxMatricular
{
    private DataController dades;
    
    private String dni;
    private int codiAss;
    private int numQuad;
    private Date data;
    
    public void executar()
    {
        if(dades.existeixMatricula(dni, codiAss, numQuad))
            throw new ExisteixMatricula();
        
        Quadrimestre q = dades.obtenirQuadrimestre(numQuad);
        Alumne al = dades.obtenirAlumne(dni);
        Assignatura as = dades.obtenirAssignatura(codiAss);
        
        as.matricular(al, q, data);
    }
}

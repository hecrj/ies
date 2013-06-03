package esdeveniments;

import esdeveniments.inscripcions.Prevista;
import java.util.List;

/**
 *
 * @author hector
 */
public class Organitzador
{
    private String nom;
    private List<Prevista> espera;
    
    public String getNom()
    {
        return nom;
    }
    
    public void eliminarPrevista(Prevista prevista)
    {
        espera.remove(prevista);
    }
}

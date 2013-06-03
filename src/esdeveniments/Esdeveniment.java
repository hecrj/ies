package esdeveniments;

import java.util.Date;

/**
 *
 * @author hector
 */
public class Esdeveniment
{
    private String nom;
    private Date data;
    private int aforament;
    private int confirmats;
    private Organitzador organitzador;
    
    public String getNomOrganitzador()
    {
        return organitzador.getNom();
    }
    
    public boolean esPle()
    {
        return aforament == confirmats;
    }
    
    public void incrementarConfirmats()
    {
        confirmats++;
    }
}

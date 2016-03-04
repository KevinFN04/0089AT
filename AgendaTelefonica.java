import java.util.*;
/**
 * Write a description of class agendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    Map<String, String> agendaTlf;
    
    /**
     * Constructor for objects of class agendaTelefonica
     */
    public AgendaTelefonica()
    {
        agendaTlf = new HashMap<String, String>();
    }
    
    /**
     * Permite almacenar un nuevo número en la agenda indicando el nombre del contacto
     * y su numero de telefono asociado
     */
    public void enterNumber(String name, String number){
        agendaTlf.put(name, number);
    }
    
    /**
     * Devuelve el numero de teléfono del contacto indicado. Si el contacto no existe, 
     * devuelve null.
     */
    public String lookupNumber(String name){
        return agendaTlf.get(name);
    }
}

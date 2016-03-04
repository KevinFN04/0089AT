
/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{
    private int numeroTestsFallados;
    /**
     * Constructor for objects of class TestAgendaTelefonica
     */
    public TestAgendaTelefonica()
    {
        numeroTestsFallados = 0;
        //Primer Test, consulta con la agenda en blanco.
        AgendaTelefonica agenda = new AgendaTelefonica();
        numeroTestsFallados += testea(null, agenda.lookupNumber("a"), "lookupNumber(Vacia)");
        //Segundo Test, comprueba que se añadan bien los contactos.
        agenda.enterNumber("Adrian", "685101010");
        agenda.enterNumber("Dani", "685202020");
        agenda.enterNumber("Noelia", "685303030");
        numeroTestsFallados += testea("685101010", agenda.lookupNumber("Adrian"), "enterNumber(Adrian, 685101010)");
        numeroTestsFallados += testea("685202020", agenda.lookupNumber("Dani"), "enterNumber(Dani, 685202020)");
        numeroTestsFallados += testea("685303030", agenda.lookupNumber("Noelia"), "enterNumber(Noelia, 685303030)");
        //Tercer Test, consulta los numeros de la agenda.
        numeroTestsFallados += testea("685101010", agenda.lookupNumber("Adrian"), "lookupNumber(Adrian)");
        numeroTestsFallados += testea("685202020", agenda.lookupNumber("Dani"), "lookupNumber(Dani)");
        numeroTestsFallados += testea("685303030", agenda.lookupNumber("Noelia"), "lookupNumber(Noelia)");
        //Cuarto Test, consulta un numero de un contacto inexistente.
        numeroTestsFallados += testea(null, agenda.lookupNumber("Inexistente"), "lookupNumber(Inexistente)");
        
        if (numeroTestsFallados == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + numeroTestsFallados + " tests!!!");
        }
    }
    
    public int testea(Object valorEsperado, Object valorObtenido, 
                          String nombreFuncion)
    {
        int valorDevuelto = 0;
        if (valorEsperado == valorObtenido) {
            System.out.println("OK: " + nombreFuncion);
        }
        else {
            System.out.println("ERROR!!!!! " + nombreFuncion);
            System.out.println("Valor obtenido: " + valorObtenido + 
                               " / Valor esperado: " + valorEsperado);
            valorDevuelto = 1;
        }
        return valorDevuelto;
    }
}
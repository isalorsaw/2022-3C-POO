package parcial2.clase;
import javax.swing.JOptionPane;
public class TestLibro
{
    public static void main(String args[])
    {
        /*String titulo=new BancoFM().pedirCadena("Favor INgrese el Titulo del Libro");
        String autor=new BancoFM().pedirCadena("Favor INgrese el Autor del Libro");
        int ej=new BancoFM().pedirNumero("Favor INgrese El Numero de Ejemplares");
        Libro l=l=new Libro(titulo,autor,3,0);
        new BancoFM().mensaje(l.toString());*/
        
        boolean seguir=true;
        Libro l[]=new Libro[5];
        String menu="Menu\n1.Agregar Nuevo Libro\n2.Prestar un Libro\n3.Devolver un Libro\n"+
        "4.Agregar mas ejemplares\n5.Listar todos los libros\n0.Salir";
        inicializar(l);
        
        do
        {
            int opcion=new BancoFM().pedirNumero(menu);
            
            switch(opcion)
            {
                case 1:
                    agregar(l);
                break;
                
                case 5:
                    listarLibros(l);
                break;
                
                case 0:
                    seguir=false;
                break;
            }
        }while(seguir);
    }
    public static void listarLibros(Libro l[])
    {
        String c="";
        int i=0;
        while(i<l.length)
        {
            if(!l[i].getTitulo().equals(""))
            c+=l[i].toString()+"\n";
            i++;
        }
        new BancoFM().mensaje(c);
    }
    public static void agregar(Libro l[])
    {
        int i=0;
        while(i<l.length)
        {
            if(l[i].getTitulo().equals(""))
            {
                l[i].agregar();
                i=l.length;
            }
            i++;
        }
    }
    public static void inicializar(Libro l[])
    {
        int i=0;
        while(i<l.length)
        {
            l[i]=new Libro();
            i++;
        }
    }
    public static void main2()
    {
        Libro l;
        
        //l=new Libro();
        
        l=new Libro("Como programar en Java","Deitel",3,0);
        
        //l=new Libro("Como programar en Java","Deitel");
        
        mensaje(l.toString());
        
        l.prestamo();
        l.prestamo();
        l.prestamo();
        l.prestamo();
        
        mensaje(l.toString());
    }
    public static void mensaje(String m)
    {
        JOptionPane.showMessageDialog(null,m);
    }
}
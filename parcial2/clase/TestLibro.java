package parcial2.clase;
import javax.swing.JOptionPane;
public class TestLibro
{
    public static void main(String args[])
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
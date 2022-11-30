package parcial3.AyudaMovimiento;
import javax.swing.JFrame;
public class Pral extends JFrame
{
    Escenario e;
    public Pral()
    {
        super("Titulo del Formulario");//Titulo que aparecera arriba de la ventana
        e=new Escenario();
        add(e);        
        setSize(800,500);//Tamanio X Y, Alto y Ancho
        setVisible(true);//Va a mostrar el Formulario con true, sino false
        setLocationRelativeTo(null);//Centra el Formulario
    }
    public static void main(String args[])
    {
        new Pral();
    }
}
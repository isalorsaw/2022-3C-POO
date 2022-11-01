package parcial2.IntroDibujar;
import javax.swing.JFrame;
public class Pral extends JFrame
{
    public Pral()
    {
        super("Titulo del Formulario");//Titulo que aparecera arriba de la ventana
        
        
        setSize(500,300);//Tamanio X Y, Alto y Ancho
        setVisible(true);//Va a mostrar el Formulario con true, sino false
        setLocationRelativeTo(null);//Centra el Formulario
    }
    public static void main(String args[])
    {
        new Pral();
    }
}
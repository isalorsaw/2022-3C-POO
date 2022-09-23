import javax.swing.JOptionPane;
public class Ejercicio5
{
    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null,"Ingrese un Nombre y un Apellido y se mostrar concatenado");
        
        String nombre=JOptionPane.showInputDialog("Ingrese un Nombre");
        String apellido=JOptionPane.showInputDialog("Ingrese un Apellido");
        String concat=nombre+" "+apellido;
        JOptionPane.showMessageDialog(null,concat);
    }
}
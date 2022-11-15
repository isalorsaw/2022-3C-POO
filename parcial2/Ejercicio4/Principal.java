package parcial2.Ejercicio4;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
public class Principal extends JFrame
{
    Escenario e;
    public Principal()
    {
        super("Figuras");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        e=new Escenario();
        add(e);
        setSize(1000,750);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new Principal();
    }
}
package parcial2.IntroDibujar;
import java.awt.Graphics;
import java.awt.Color;
public class Circulo extends Coordenada
{
    int ancho;
    int alto;
    public Circulo(int x, int y)
    {
        super(x,y);
        alto=70;
        ancho=50;
    }
    public void dibujar(Graphics g)
    {
        //g.setColor(Color.YELLOW);
        g.setColor(new Color(212,172,165));
        g.drawOval(getX(),getY(),ancho,alto);
        g.fillOval(getX(),getY(),ancho,alto);
    }
    public String toString()
    {
        return "Coordenada "+getX()+"-"+getY()+" Ancho "+ancho+" Alto "+alto;
    }
}
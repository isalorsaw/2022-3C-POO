package parcial2.IntroDibujar;
import java.awt.Graphics;
import java.awt.Color;
public class Cuadrado extends Coordenada
{
    int area;
    public Cuadrado(int x, int y)
    {
        super(x,y);
        area=50;
    }
    public void dibujar(Graphics g)
    {
        g.setColor(Color.YELLOW);
        //g.setColor(new Color(212,172,165));
        g.drawRect(getX(),getY(),area,area);
        g.fillRect(getX(),getY(),area,area);
    }
    public String toString()
    {
        return "Coordenada "+getX()+"-"+getY()+" Area "+area;
    }
}

package parcial3.Disparos;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Bala
{
    int x;
    int y;
    ImageIcon icono;
    Image imagen;
    String ruta="Imagenes/balared.png";
    Rectangle rec;
    boolean visible;
    public Bala(int x, int y)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));
        imagen=icono.getImage();
        visible=false;
    }
    public Bala(int x, int y, boolean visible)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));
        imagen=icono.getImage();
        this.visible=visible;
    }
    public void mover(char dir)
    {
        //Pendiente
    }
    public void dibujar(Graphics g)
    {
        if(visible)
        g.drawImage(imagen,x,y,null);
    }
    public String toString()
    {
        return "X "+x+" Y "+y+" Visible "+visible;
    }
}
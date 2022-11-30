package parcial3.AyudaMovimiento;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Roca
{
    int x;
    int y;
    ImageIcon icono;
    Image imagen;
    String ruta="rock.png";
    Rectangle rec;//Intersect
    boolean visible;//Si se ve la bala o no
    public Roca(int x, int y)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));
        imagen=icono.getImage();
        visible=false;
        rec=rect();
    }
    public Roca(int x, int y, boolean visible)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));
        imagen=icono.getImage();
        this.visible=visible;
    }
    /*public Rectangle rect()//Funcion para Intersect
    {
        this.rec=new Rectangle(this.x,this.y,icono.getIconWidth(),icono.getIconHeight());
        return this.rec;
    }*/
    public Rectangle rect()//Funcion para Intersect
    {
        this.rec=new Rectangle(this.x+40,this.y,icono.getIconWidth(),icono.getIconHeight());
        return this.rec;
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
package parcial3.AyudaMovimiento;
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
    String ruta="bala.png";
    Rectangle rec;//Intersect
    boolean visible;//Si se ve la bala o no
    public Bala(int x, int y)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));
        imagen=icono.getImage();
        visible=false;
        rec=rect();
    }
    public Bala(int x, int y, boolean visible)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));
        imagen=icono.getImage();
        this.visible=visible;
    }
    public void setVisible(boolean v)
    {
        visible=v;
    }
    public Rectangle rect()//Funcion para Intersect
    {
        this.rec=new Rectangle(this.x,this.y,icono.getIconWidth(),icono.getIconHeight());
        return this.rec;
    }
    public boolean detectarChoque(Rectangle otrorec)//Funcion para choque con otro rec
    {
        if(rect().intersects(otrorec))return true;
        else return false;
    }
    public void mover(char dir)
    {
        //Pendiente
        x++;
    }
    public void moverDiagonal()
    {
        x++;
        y++;
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
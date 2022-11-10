package parcial2.Juego;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Gota extends Coordenada
{
    ImageIcon icono;
    Image imagen;
    public Gota(int x, int y, String rutai)
    {
        super(x,y);
        this.icono=new ImageIcon(getClass().getResource(rutai));
        imagen=icono.getImage();
    }
    public void mover()
    {
        int yy=getY()+1;
        setY(yy);
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(imagen,getX(),getY(),null);
    }
    
}

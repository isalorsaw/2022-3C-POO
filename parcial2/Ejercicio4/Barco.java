package parcial2.Ejercicio4;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Barco
{
    int x;
    int y;
    ImageIcon icono;
    Image imagen;
    public Barco(int x, int y)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource("yate.png"));
        imagen=icono.getImage();
    }
    public void mover(char dir)
    {
        if(dir=='i')x--;
        else if(dir=='d')x++;
        
        //if(x%5==0)x++;
        //else x--;
        
        System.out.println(x+" "+y);
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
}
package parcial2.Ejercicio4;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Barco
{
    int veces;
    int x;
    int y;
    ImageIcon icono;
    Image imagen;
    int espacio;
    char dir;
    public Barco(int x, int y)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource("yate.png"));
        imagen=icono.getImage();
        dir='i';
        
        if(dir=='i')espacio=x-20;
        else if(dir=='d')espacio=x+20;
        veces=0;
    }
    public void mover(char dir)
    {
        if(dir=='i')x--;
        else if(dir=='d')x++;
    }
    public String toString()
    {
        return "X "+x+" Y "+y+" Dir "+dir+" EspacioX "+espacio+" Veces "+veces;
    }
    public void flotar()
    {
        if(dir=='i')
        {
            if(x>espacio)
            {
                x--;
            }
            else
            {
                espacio=x+(20*veces);
                dir='d';
                veces++;
            }
        }
        if(dir=='d')
        {
            if(x<espacio)
            {
                x++;
            }
            else
            {
                espacio=x-(20*veces);
                dir='i';
                veces++;
            }
        }
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
}
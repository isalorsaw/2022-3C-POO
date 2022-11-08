package parcial2.IntroDibujar;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Rifle extends Coordenada
{
    ImageIcon icono;
    Image imagen;
    String rutaizq="Imagenes/rifleizq.png";
    String rutader="Imagenes/rifleder.png";
    String rutaarr="Imagenes/rifleizq.png";
    String rutabajo="Imagenes/rifleizq.png";
    public Rifle(int x, int y)
    {
        super(x,y);
        //this.icono=new ImageIcon(getClass().getResource(rutaizq));
        this.icono=new ImageIcon(getClass().getResource(rutader));
        imagen=icono.getImage();
    }
    public void mover(char mov)
    {
        if(mov=='i')//Accion para la izq
        {
            
        }
        else if(mov=='d')//Accion para la Der
        {
            
        }
        else if(mov=='a')//Accion para Arriba
        {
            
        }
        else if(mov=='b')//Accion para Abajo
        {
            
        }
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(this.imagen,getX(),getY(),null);
    }
}
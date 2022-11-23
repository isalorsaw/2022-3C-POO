package parcial3.Disparos;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Rifle
{
    int x;
    int y;
    ImageIcon icono;
    Image imagen;
    String rutaizq="Imagenes/rifleizq.png";
    String rutader="Imagenes/rifleder.png";
    String rutaarr="Imagenes/rifleup.png";
    String rutabajo="Imagenes/rifledown.png";
    Rectangle rec;
    public Rifle(int x, int y, String r)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource("Imagenes/"+r));
        imagen=icono.getImage();
    }
    public Rectangle rect()
    {
        this.rec=new Rectangle(this.x,this.y,icono.getIconWidth(),icono.getIconHeight());
        return this.rec;
    }
    public boolean detectarChoque(Rectangle recotro)
    {
        boolean sichoque=false;
        if(this.rec.intersects(recotro))sichoque=true;
        return sichoque;
        
    }
    public void mover(char mov)
    {
        if(mov=='i')//Accion para la izq
        {
            cambiarImagen(rutaizq);
            x--;
        }
        else if(mov=='d')//Accion para la Der
        {
            cambiarImagen(rutader);
            x++;
        }
        else if(mov=='a')//Accion para Arriba
        {
            cambiarImagen(rutaarr);
            y--;
        }
        else if(mov=='b')//Accion para Abajo
        {
            cambiarImagen(rutabajo);
            y++;
        }
    }
    public void cambiarImagen(String ruta)
    {
        this.icono=new ImageIcon(getClass().getResource(ruta));
        imagen=icono.getImage();
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(this.imagen,x,y,null);
    }
}
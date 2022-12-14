package parcial2.IntroDibujar;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;
public class Escenario extends JPanel
{
    Circulo c[]=new Circulo[10];
    Cuadrado cu[]=new Cuadrado[5];
    ImageIcon icono;
    Image imagen;
    Rifle rif;
    public Escenario()
    {
        inicializarCirculo(c);
        inicializarCuadrado();
        
        this.icono=new ImageIcon(getClass().getResource("Imagenes/fondo.png"));
        this.imagen=icono.getImage();
        
        rif=new Rifle(200,200);
        //imprimirCirculo(c);
        //setSize(800,500);
        setVisible(true);
    }
    public void inicializarCirculo(Circulo c[])
    {
        for(int i=0;i<c.length;i++)
        {
            int xx=BancoFM.aleatorio(10,700);
            //int xx=200;
            int yy=BancoFM.aleatorio(10,400);
            c[i]=new Circulo(xx,yy);
        }
    }
    public void inicializarCuadrado()
    {
        for(int i=0;i<cu.length;i++)
        {
            int xx=BancoFM.aleatorio(10,700);
            //int xx=200;
            int yy=BancoFM.aleatorio(10,400);
            cu[i]=new Cuadrado(xx,yy);
        }
    }
    public void dibujarCirculos(Graphics g)
    {
        for(int i=0;i<c.length;i++)
        {
            c[i].dibujar(g);
        }
    }
    public void dibujarCuadrados(Graphics g)
    {
        for(int i=0;i<cu.length;i++)
        {
            cu[i].dibujar(g);
        }
    }
    public void imprimirCirculo(Circulo c[])
    {
        String m="Informacion de los Circulos\n";
        for(int i=0;i<c.length;i++)
        {
            m+=c[i].toString()+"\n";
        }
        BancoFM.mensaje(m);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        dibujarFondo(g);
        dibujarCirculos(g);
        dibujarCuadrados(g);
        rif.dibujar(g);
        //g.drawString("Muestra",400,250);
        //g.drawString("Otra Muestra",10,10);
        
        //g.drawLine(10,10,400,400);
    }
    public void dibujarFondo(Graphics g)
    {
        g.drawImage(this.imagen,0,0,null);
    }
}
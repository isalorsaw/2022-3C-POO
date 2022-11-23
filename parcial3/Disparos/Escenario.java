package parcial3.Disparos;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Image;
//Librerias para Evento del Teclado
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
//Librerias para Evento de Accion
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Escenario extends JPanel implements KeyListener, ActionListener
{
    Rifle rif;
    Timer t;
    Bala b[]=new Bala[5];
    int indice;
 /*   ImageIcon icono;
    Image imagen;
    Rifle rif;
    Rifle rif2;
    Gota got;
    Gota gots[];
    Timer t;*/
    public Escenario()
    {
        t=new Timer(2,null);
        t.addActionListener(this);
        t.start();
        
        addKeyListener(this);
        setFocusable(true);
        
        inicializarBalas();
        indice=0;
        /*//Inicializar El Fondo
        this.icono=new ImageIcon(getClass().getResource("Imagenes/fondo.png"));
        this.imagen=icono.getImage();
        */
       
        rif=new Rifle(200,200,"rifleder.png");
        setFocusable(true);
        setVisible(true);
    }
    public void inicializarBalas()
    {
        for(int i=0;i<b.length;i++)
        {
            b[i]=new Bala(100,100);
        }
    }
    public static int aleatorio(int d, int h)
    {
        return ((int)(Math.random()*(h-d+1)+d));
    }
    /*public void dibujarGotas(Graphics g)
    {
        for(int i=0;i<gots.length;i++)
        {
            gots[i].dibujar(g);
        }
    }*/
    public void keyTyped(KeyEvent e)//Tocar tecla
    {
    }
    public void keyReleased(KeyEvent e)//Soltar tecla
    {
    }
    public void keyPressed(KeyEvent e)//Presionar Tecla
    {
        int codigo=e.getKeyCode();
        if(codigo==KeyEvent.VK_RIGHT)rif.mover('d');
        else if(codigo==KeyEvent.VK_LEFT)rif.mover('i');
        else if(codigo==KeyEvent.VK_UP)rif.mover('a');
        else if(codigo==KeyEvent.VK_DOWN)rif.mover('b');
        else if(codigo==KeyEvent.VK_SPACE)
        {
            if(indice<b.length-1)//Lo quitaremos cuando redefinamos el arreglo
            b[indice]=new Bala(rif.x,rif.y);
            b[indice].visible=true;//Se hace de esta manera porque visible es public
            indice++;
        }
        repaint();
        
    }
    public void actionPerformed(ActionEvent e)
    {
        //repaint();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        rif.dibujar(g);
        dibujarBalas(g);
        System.out.println(indice+"");
    }
    public void dibujarBalas(Graphics g)
    {
        for(int i=0;i<b.length;i++)
        {
            b[i].dibujar(g);
        }
    }
    public void dibujarFondo(Graphics g)
    {
        //g.drawImage(this.imagen,0,0,null);
    }
}
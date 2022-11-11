package parcial2.Juego;
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
    ImageIcon icono;
    Image imagen;
    Rifle rif;
    Rifle rif2;
    Gota got;
    Gota gots[];
    Timer t;
    public Escenario()
    {
        //Inicializar El Fondo
        this.icono=new ImageIcon(getClass().getResource("Imagenes/fondo.png"));
        this.imagen=icono.getImage();
        
        //Inicializar el Timer
        t=new Timer(2,null);
        t.addActionListener(this);
        t.start();
        
        //Inicializar la Gota
        got=new Gota(400,30,"Imagenes/gota.png");
        gots=new Gota[20];
        inicializarGotas();
        //Importante Agregar la escucha del evento del teclado
        addKeyListener(this);
        setFocusable(true);
        
        rif=new Rifle(200,200,"rifleder.png");
        rif2=new Rifle(600,200,"rifleizq.png");
        setVisible(true);
    }
    public static int aleatorio(int d, int h)
    {
        return ((int)(Math.random()*(h-d+1)+d));
    }
    public void inicializarGotas()
    {
        for(int i=0;i<gots.length;i++)
        {
            int xx=aleatorio(10,700);
            int yy=10;
            gots[i]=new Gota(xx,yy,"Imagenes/gota.png");
        }
    }
    public void moverGotas()
    {
        for(int i=0;i<gots.length;i++)
        {
            gots[i].mover();
        }
    }
    public void dibujarGotas(Graphics g)
    {
        for(int i=0;i<gots.length;i++)
        {
            gots[i].dibujar(g);
        }
    }
    public void keyTyped(KeyEvent e)//Tocar tecla
    {
    }
    public void keyReleased(KeyEvent e)//Soltar tecla
    {
    }
    public void keyPressed(KeyEvent e)//Presionar Tecla
    {
        int codigo=e.getKeyCode();
        //moverNormal(codigo);
        mover2Player(codigo);
        repaint();
    }
    public void mover2Player(int codigo)
    {
        if(codigo==KeyEvent.VK_RIGHT)rif2.mover('d');
        else if(codigo==KeyEvent.VK_LEFT)rif2.mover('i');
        else if(codigo==KeyEvent.VK_UP)rif2.mover('a');
        else if(codigo==KeyEvent.VK_DOWN)rif2.mover('b');
        
        if(codigo==KeyEvent.VK_W)rif.mover('a');
        else if(codigo==KeyEvent.VK_S)rif.mover('b');
        else if(codigo==KeyEvent.VK_A)rif.mover('i');
        else if(codigo==KeyEvent.VK_D)rif.mover('d');        
    }
    public void moverNormal(int codigo)
    {
        if(codigo==KeyEvent.VK_RIGHT)rif.mover('d');
        else if(codigo==KeyEvent.VK_LEFT)rif.mover('i');
        else if(codigo==KeyEvent.VK_UP)rif.mover('a');
        else if(codigo==KeyEvent.VK_DOWN)rif.mover('b');
        else if(codigo==KeyEvent.VK_W)rif.mover('a');
        else if(codigo==KeyEvent.VK_S)rif.mover('b');
        else if(codigo==KeyEvent.VK_A)rif.mover('i');
        else if(codigo==KeyEvent.VK_D)rif.mover('d');
    }
    public void actionPerformed(ActionEvent e)
    {
        got.mover();
        moverGotas();
        repaint();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        dibujarFondo(g);
        rif.dibujar(g);
        rif2.dibujar(g);
        got.dibujar(g);
        dibujarGotas(g);
    }
    public void dibujarFondo(Graphics g)
    {
        g.drawImage(this.imagen,0,0,null);
    }
}
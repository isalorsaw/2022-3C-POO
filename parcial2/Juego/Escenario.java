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
    Gota got;
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
        
        //Importante Agregar la escucha del evento del teclado
        addKeyListener(this);
        setFocusable(true);
        
        rif=new Rifle(200,200);
        setVisible(true);
    }
    public void keyTyped(KeyEvent e)//Tocar tecla
    {
        /*int codigo=e.getKeyCode();
        char c=e.getKeyChar();
        System.out.println(codigo+" "+c);*/
    }
    public void keyReleased(KeyEvent e)//Soltar tecla
    {
        /*int codigo=e.getKeyCode();
        char c=e.getKeyChar();
        System.out.println(codigo+" "+c);*/
    }
    public void keyPressed(KeyEvent e)//Presionar Tecla
    {
        int codigo=e.getKeyCode();
        char c=e.getKeyChar();
        //System.out.println("Codigo "+codigo+" Char "+c);
        
        if(codigo==39)rif.mover('d');
        else if(codigo==37)rif.mover('i');
        else if(codigo==38)rif.mover('a');
        else if(codigo==40)rif.mover('b');
        repaint();
    }
    public void actionPerformed(ActionEvent e)
    {
        got.mover();
        repaint();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        dibujarFondo(g);
        rif.dibujar(g);
        got.dibujar(g);
    }
    public void dibujarFondo(Graphics g)
    {
        g.drawImage(this.imagen,0,0,null);
    }
}
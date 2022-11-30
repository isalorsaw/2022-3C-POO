package parcial3.AyudaMovimiento;
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
import java.io.File;
public class Escenario extends JPanel implements KeyListener,ActionListener
{
    String rutaproy="parcial3/AyudaMovimiento/mp3/";
    Timer t;
    Bala b;
    Roca r;
    public Escenario()
    {
        b=new Bala(10,10,true);
        r=new Roca(200,200,true);
        
        t=new Timer(10,null);
        t.addActionListener(this);
        t.start();
        
        addKeyListener(this);
        setFocusable(true);
        
        
        /*//Inicializar El Fondo
        this.icono=new ImageIcon(getClass().getResource("Imagenes/fondo.png"));
        this.imagen=icono.getImage();
        */
       
        setFocusable(true);
        setVisible(true);
    }
    /*public void inicializarBalas()
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
    */
    public void keyTyped(KeyEvent e)//Tocar tecla
    {
    }
    public void keyReleased(KeyEvent e)//Soltar tecla
    {
    }
    public void keyPressed(KeyEvent e)//Presionar Tecla
    {
        if(e.getKeyCode()==e.VK_SPACE)
        {
            playSound("mariobros.mp3");
        }
    }
    public void redefinirBala()
    {
        /*redefinir();
        System.out.println(b.length+" Length de Balas");
        b[b.length-1]=new Bala(rif.x,rif.y,true);
        imprimir(b,"Coordenadas de Bala");*/
    }
    public void playSound(String filename)
    {
        //File file=new File("C:/shot.mp3");
        File file=new File(rutaproy+filename);
        String ruta=file.getAbsolutePath();
        //System.out.println(ruta);
        
        //String filename = "mariobros.mp3";//Inicializamos la Ruta
        MP3Player mp3Player = new MP3Player(ruta);//Inicializamos MP3Player
       // mp3Player.setVolume(-30f);
        mp3Player.play();//Reproducimos
    }
    public void actionPerformed(ActionEvent e)
    {
        //b.moverDiagonal();
        //repaint();
        boolean sichoque=b.detectarChoque(r.rect());
        if(sichoque)
        {
             //b.visible=false; 
             //b.setVisible(false);
             b=new Bala(10,10,true);
             playSound("shot.mp3");
        }
        else System.out.println("TODAVIA NO!");
        
        b.moverDiagonal();
        repaint();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        b.dibujar(g);
        r.dibujar(g);
    }
    public void dibujarFondo(Graphics g)
    {
        //g.drawImage(this.imagen,0,0,null);
    }
}
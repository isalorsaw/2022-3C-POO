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
public class Escenario extends JPanel implements ActionListener
{
    Timer t;
    Bala b;
    Roca r;
    public Escenario()
    {
        b=new Bala(10,10,true);
        r=new Roca(400,350,true);
        
        t=new Timer(5,null);
        t.addActionListener(this);
        t.start();
        
        //addKeyListener(this);
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
    }
    public void redefinirBala()
    {
        /*redefinir();
        System.out.println(b.length+" Length de Balas");
        b[b.length-1]=new Bala(rif.x,rif.y,true);
        imprimir(b,"Coordenadas de Bala");*/
    }
    
    public void actionPerformed(ActionEvent e)
    {
        //b.moverDiagonal();
        //repaint();
        boolean sichoque=b.detectarChoque(r.rect());
        if(sichoque)System.out.println("Si hay choque");
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
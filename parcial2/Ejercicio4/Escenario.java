package parcial2.Ejercicio4;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class Escenario extends JPanel implements ActionListener, KeyListener, MouseListener
{
    Barco b;
    Timer t;
    public Escenario()
    {
        t=new Timer(400,null);
        t.addActionListener(this);
        t.start();
        
        b=new Barco(aleatorio(33,930),320);
        
        addKeyListener(this);
        addMouseListener(this);
        
        setFocusable(true);
        setSize(300,300);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public void mouseClicked(MouseEvent e)
    {
        System.out.println(e.getX()+" "+e.getY());
    }
    public void mouseExited(MouseEvent e){}
    public void mouseEntered(MouseEvent e)
    {
        
    }
    public void mouseReleased(MouseEvent e)
    {
        
    }
    public void mousePressed(MouseEvent e)
    {
        
    }
    public void actionPerformed(ActionEvent e)
    {
        //b.mover('i');
        b.flotar();
        repaint();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        b.dibujar(g);
        g.drawLine(33,457,935,457);
        g.drawString(b.toString(),400,500);
    }
    public static int aleatorio(int d, int h)
    {
        return ((int)(Math.random()*(h-d+1)+d));
    }
}


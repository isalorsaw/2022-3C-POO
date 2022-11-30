package parcial3.AyudaMovimiento;
import javazoom.jl.player.Player;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.File;
import javax.swing.JOptionPane;
public class MP3Player 
{
    private final String mp3FileToPlay;
    private Player jlPlayer;

    public MP3Player(String mp3FileToPlay)//Constructor
    {
        this.mp3FileToPlay = mp3FileToPlay;
    }

    public void play()//Reproducir
    {
        try 
        {
            FileInputStream fileInputStream = new FileInputStream(mp3FileToPlay);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            jlPlayer = new Player(bufferedInputStream);
        }
        catch (Exception e) 
        {
            System.out.println("Problem playing mp3 file " + mp3FileToPlay);
            System.out.println(e);
        }

        new Thread() //Hilo=Thread
        {
            public void run() 
            {
                try 
                {
                    jlPlayer.play();
                }
                catch (Exception e) 
                {
                    System.out.println(e.getMessage());
                }
            }
        }.start();
    }
    public void close()//Stop o Parar
    {
        if (jlPlayer != null) jlPlayer.close();
    }
    public static void main(String[] args) 
    {
        File file=new File("parcial3/AyudaMovimiento/mp3/mariobros.mp3");
        String ruta=file.getAbsolutePath();
        System.out.println(ruta);
        
        //String filename = "mariobros.mp3";//Inicializamos la Ruta
        MP3Player mp3Player = new MP3Player(ruta);//Inicializamos MP3Player
        mp3Player.play();//Reproducimos
        
        int r=JOptionPane.showConfirmDialog(null,"Desea Parar la Cancion");
        if(r==0)
        {
            mp3Player.close();
        }
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Write stop to stop the music: ");

        if (sc.nextLine().equalsIgnoreCase("stop")) {
            mp3Player.close();
        }/**/
    }
}
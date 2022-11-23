package parcial3.EjemploAudio;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;
public class MainAudio 
{
    public static void main(String[] args) 
    {

        String filename = "mp3/mariobros.mp3";
        MP3Player mp3Player = new MP3Player(filename);
        mp3Player.play();

        Scanner sc = new Scanner(System.in);

        System.out.println("Write stop to stop the music: ");

        if (sc.nextLine().equalsIgnoreCase("stop")) {
            mp3Player.close();
        }
        
        //String filename=new java.io.File("mp3/").getAbsolutePath();
        //System.out.println(filename);
        /*MP3Player mp3Player = new MP3Player(filename);
        mp3Player.play();
        
        int res=javax.swing.JOptionPane.showConfirmDialog(null,"Parar Ahora?");
        if(res==0)mp3Player.close();*/
    }
}
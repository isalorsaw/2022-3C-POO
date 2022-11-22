import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;
public class MainAudio 
{
    public static MP3Player mp3Player;
    public static void main(String[] args) 
    {

        /*String filename = "mariobros.mp3";
        MP3Player mp3Player = new MP3Player(filename);
        mp3Player.play();*/
        
        play("mariobros.mp3");

        Scanner sc = new Scanner(System.in);

        System.out.println("Write stop to stop the music: ");

        if (sc.nextLine().equalsIgnoreCase("stop")) {
            mp3Player.close();
        }
    }
    
    public static void play(String archivo)
    {
        mp3Player = new MP3Player(archivo);
        mp3Player.play();

    }
}
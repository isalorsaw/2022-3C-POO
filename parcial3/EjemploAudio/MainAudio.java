package parcial3.EjemploAudio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;
public class MainAudio 
{
    public static void main(String[] args) 
    {

        String filename = "mariobros.mp3";
        MP3Player mp3Player = new MP3Player(filename);
        mp3Player.play();

        Scanner sc = new Scanner(System.in);

        System.out.println("Write stop to stop the music: ");

        if (sc.nextLine().equalsIgnoreCase("stop")) {
            mp3Player.close();
        }
    }
}
import javax.swing.JOptionPane;
public class Repaso21710
{
    public static void main(String args[])
    {
        String palabra="honduras";//pedirCadena("Ingrese una Palabra");
        char letra='d';//pedirLetra("Ingrese una Letra para buscar en "+palabra);
        
        boolean s=siExisteLetra(palabra,letra);
        
        JOptionPane.showMessageDialog(null,""+s);
        
        if(s==true)JOptionPane.showMessageDialog(null,letra+" Si se encuentra en "+palabra);
        else JOptionPane.showMessageDialog(null,letra+" NO se encuentra en "+palabra);
        
        
    }
    /*public static boolean siExisteLetra2(String pal,char l)
    {
        boolean s=false;
        int i=0;
        while(i<pal.length())
        {
            char le=pal.charAt(i);
            if(le==l)return true;//h = honduras
            i++;
        }
        return false;
    }*/
    public static boolean siExisteLetra(String pal,char l)
    {
        boolean s=false;
        int i=0;
        while(i<pal.length())
        {
            char le=pal.charAt(i);
            if(le==l)s=true;//return true;//h = honduras
            i++;
        }
        return s;
    }

}
package parcial2.clase;
import javax.swing.JOptionPane;
public class BancoFM
{
    //PedirCadena
    public static String pedirCadena(String msg)
    {
        boolean seguir=true;
        String c="";
        do
        {
            try
            {
                c=JOptionPane.showInputDialog(msg);
                if(c.length()>0)seguir=false;   
            }
            catch(Exception exp)
            {
                mensaje("Valor No Reconocido");
            }
        }
        while(seguir);
        return c;
    }
    //Pedir Letra
    public static char pedirLetra(String msg)
    {
        char l=' ';
        int tam=0;
        boolean seguir=true;
        
        do
        {
            String c=pedirCadena("Favor Ingrese una Letra");
            if(c.length()==1)
            {
                l=c.charAt(0);
                seguir=false;
            }
            else mensaje("La cadena que ingreso debe de ser 1 caracter");
        }
        while(seguir);
        
        return l;
    }
    public static int pedirNumero(String msg)//PedirEntero
    {
        boolean seguir=true;
        String entrada="";
        int n=0;
        
        do
        {
            try
            {
                entrada=JOptionPane.showInputDialog(msg);
                n=Integer.parseInt(entrada);
                seguir=false;
            }
            catch(Exception exp)
            {
                mensaje("Ingrese un Caracter Invalido");
            }
        }
        while(seguir);
        return n;
    }
    //Funcion que pide un double y lo retorna
    public static double pedirDouble(String msg)
    {
        boolean seguir=true;
        String entrada="";
        double n=0;
        
        do
        {
            try
            {
                entrada=JOptionPane.showInputDialog(msg);
                n=Double.parseDouble(entrada);
                seguir=false;
            }
            catch(Exception exp)
            {
                mensaje("Ingrese un Caracter Invalido");
            }
        }
        while(seguir);
        return n;
    }
    //Mensaje
    public static void mensaje(String m)
    {
        JOptionPane.showMessageDialog(null,m);
    }
    //PedirDouble
}
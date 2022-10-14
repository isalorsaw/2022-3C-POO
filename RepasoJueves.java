/*
   Pedir un Numero Entero y Pedir un Double y Mostrar la Potencia de ellos
   */
import javax.swing.JOptionPane;
public class RepasoJueves
{
    public static void main(String args[])
    {
        double n1=pedirDouble("Ingrese la Base");
        int n2=pedirEntero("Ingrese el Exponente");
        double potencia=potenciar(n1,n2);
        mensaje(n1+" a la "+n2+" es "+potencia);
        double potencia2=potenciarR(n1,n2);
        mensaje(n1+" a la "+n2+" es "+potencia2);
    }
    public static void mensaje(String m)
    {
        JOptionPane.showMessageDialog(null,m);
    }
    public static int pedirEntero(String msg)
    {
        String m="";
        int n=0;
        boolean seguir=true;
        do
        {
            try
            {
               m=JOptionPane.showInputDialog(msg);
               n=Integer.parseInt(m);
               seguir=false;
            }
            catch(Exception exp)
            {
                mensaje(m+" no es un entero");
            }
        }
        while(seguir);
        return n;
    }
    public static double pedirDouble(String msg)
    {
        String m="";
        double n=0;
        boolean seguir=true;
        do
        {
            try
            {
               m=JOptionPane.showInputDialog(msg);
               n=Double.parseDouble(m);
               seguir=false;
            }
            catch(Exception exp)
            {
                mensaje(m+" no es un double");
            }
        }
        while(seguir);
        return n;
    }
    public static double potenciar(double b, int e)
    {
        //double res=Math.pow(b,e);
        //return res;
        return Math.pow(b,e);
    }
    public static double potenciarR(double b, int e)
    {
        //return Math.round(Math.pow(b,e));
        double res=Math.pow(b,3);
        double r=Math.round(res);
        return r;
    }
}
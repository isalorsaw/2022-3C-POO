import javax.swing.JOptionPane;
public class RepasoCiclo
{
    public static void main(String args[])
    {
        boolean seguir=true;
        int opcion=0;
        String palabra="";
        
        do
        {
            opcion=pedirEntero("Menu Principal\n1.Ingrese una Palabra\n"+
            "2.Contar Cuantos Numeros Tiene La Palabra\n0. Salir");
            
            if(opcion==0)seguir=false;
            else if(opcion==1)palabra=pedirCadena("Ingrese una Palabra");
            else if(opcion==2)
            {
                int c=contarNumeros(palabra);
                mensaje("<"+palabra+"> tiene "+c+" Numeros");
            }
            
        }while(seguir);
        
        mensaje("Adios. Fin del Programa");
    }
    public static int contarNumeros(String p)
    {
        int c=0;
        //Repaso de For
        for(int i=0;i<p.length();i++)
        {
            char l=p.charAt(i);
            int codigo=(int)l;
            //System.out.println(codigo+" "+l);
            if(codigo>=48&&codigo<=57)c++;
        }
        return c;
    }
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
    public static int pedirEntero(String msg)//PedirEntero
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
    public static void mensaje(String m)
    {
        JOptionPane.showMessageDialog(null,m);
    }
}
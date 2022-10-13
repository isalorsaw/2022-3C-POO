/*
   Ejemplo de Uso de Metodos y Funciones
   */
import javax.swing.JOptionPane;
public class EjemploFunMed
{
    public static void main(String args[])
    {
        /*int num1=pedirNumero("Favor Ingrese el Primer Numero");//Funcion
        int num2=pedirNumero("Favor Ingrese el Segundo Numero");//Funcion
        int suma=suma(num1,num2);//Funcion
        mensaje("La Suma de "+num1+" y "+num2+"="+suma);//Metodo*/
        
        String cadena=pedirCadena("Favor Ingrese una Cadena de Caracteres");
        
        
        int menu=pedirNumero("OPCIONES DE MENU\n1. Tamaño de Cadena\n"+
                    "2. Mostrar Letra en Pos\n3. Mostrar Primera Letra\n4. Mostrar Ultima Letra\n "+
                    "5.Convertir a Minuscula\n6. Convertir a Mayuscula\n7. Invertir Cadena\n 8.Mostrar "+
                    "las minusculas\n9. Mostrar las mayusculas\n10. Mostrar la letra de enmedio (Si es posible)\n"+
                    "11.Remover Espacios\n12. Pedir una letra y buscar en la cadena\n13.Salir");
                    
        switch(menu)
        {
            case 1:
                //int t=tamanio(cadena);
                //mensaje("El tamanio de la cadena "+cadena+" es "+t);
            break;
            
            case 2:
                //char l=primeraLetra(cadena);
                //mensaje("La Primera Letra de la cadena "+cadena+" es "+l);
            break;
            
            case 12:
                //char letra=pedirLetra("Ingrese una Letra para buscar en "+cadena);
                //boolean b=buscarLetraEnCadena(letra,cadena);
            break;
        }
    }
    //Funcion que pide un string y la retornar
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
    //Funcion que pide una letra y la retorna
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
    //Metodo que recibe un cadena y lo muestra en pantalla
    public static void mensaje(String m)
    {
        JOptionPane.showMessageDialog(null,m);
    }
    //Funcion que suma dos enteros y retorna el resultado
    public static int suma(int n1, int n2)
    {
        int s=n1+n2;
        return s;
    }
    //Funcion de pedir un numero y devolverlo
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
}
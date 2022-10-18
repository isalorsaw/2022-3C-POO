import javax.swing.JOptionPane;
public class Ejercicio1710
{
    public static void main(String args[])
    {
        int numero1=pedirEntero("Favor Ingrese el Primer Entero");
        int numero2=pedirEntero("Favor Ingrese el Segundo Entero");
        
        int menor=min(numero1,numero2);
        int mayor=max(numero1,numero2);
        
        //if(numero1<numero2)menor=numero1;
        //else if(numero2<numero1)menor=numero2;
        
        //menor=Math.min(numero1,numero2);
        
        JOptionPane.showMessageDialog(null,"El Menor de los dos numeros es "+menor);
        JOptionPane.showMessageDialog(null,"El Mayor de los dos numeros es "+mayor);
    }
    public static int min(int n1, int n2)
    {
        return Math.min(n1,n2);
    }
    public static int max(int n1, int n2)
    {
        return Math.max(n1,n2);
    }
}
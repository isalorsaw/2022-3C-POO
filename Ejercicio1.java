//Importar Librerias.
import javax.swing.JOptionPane;
public class Ejercicio1
{//Inicio Class
    public static void main(String args[])
    {//Inicio Main
        
        //Salida=Muestra de que se trata el programa
        JOptionPane.showMessageDialog(null,"Este programa pide 3 numeros y muestra la suma");
        
        //Declaraciones e Inicializacion
        int n1=0;
        int n2=0;
        int n3=0;
        int suma=0;
        
        //Entrada de Primer Numero
        String nn1=JOptionPane.showInputDialog("Favor Ingrese el Primer Numero");
        n1=Integer.parseInt(nn1);
        
        //Entrada de Segundo Numero
        String nn2=JOptionPane.showInputDialog("Favor Ingrese el Segundo Numero");
        n2=Integer.parseInt(nn2);
        
        //Entrada de Tercer Numero
        String nn3=JOptionPane.showInputDialog("Favor Ingrese el Tercer Numero");
        n3=Integer.parseInt(nn3);
        
        //Se hace la suma
        suma=n1+n2+n3;
        
        //double prom=(n1+n2+n2)/4;
        
        //Muestra el resultado de la suma
        JOptionPane.showMessageDialog(null,"La Suma de los numeros ingresados es: "+suma);
    }//Fin Main
}//Fin Class

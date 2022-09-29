/*
   Escribir un algoritmo que, dada una nota ingresada por el usuario si esta es 
   menor que 70 escriba "Reprobado" 
   si la nota es mayor que 70 pero menor que 90 "Bueno" 
   y si la nota es mayor que 90 imprima “Excelente”.   
*/
import javax.swing.JOptionPane;
public class Ejercicio11
{
    public static void main(String args[])
    {
        //Declarar e Inicializar Variables
        int nota=0;
        
        //Entrada
        String n=JOptionPane.showInputDialog("Ingrese una Nota");
        nota=Integer.parseInt(n);
        
        if(nota<70)
        {
             JOptionPane.showMessageDialog(null,"Usd esta Reprobado");   
        }
        else if(nota>70&&nota<90)//Operaciones Logicas
        {
            JOptionPane.showMessageDialog(null,"Su Calificacion es Bueno");
        }
        else if(nota>90)
        {
            JOptionPane.showMessageDialog(null,"Su calificacion es Excelente");
        }
    }
}
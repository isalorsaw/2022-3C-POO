/*
   Este programa pedira 1 numero y me mostrara un mensaje si es mayor, menor o igual a 15.
   */
  public class CopyOfEjercicio4
 {//Inicio
     public static void main(String args[])
     {//Inicio
         
        javax.swing.JOptionPane.showMessageDialog(null,"Este programa pide 1 numero y mostrara si es Mayor, Menor o Igual a 15");
         
        String entrada=javax.swing.JOptionPane.showInputDialog("Ingrese un Numero");
        int num=Integer.parseInt(entrada);
        
        if(num==15)javax.swing.JOptionPane.showMessageDialog(null,"El Numero que ingreso es IGUAL a 15");
        else if(num<15)javax.swing.JOptionPane.showMessageDialog(null,"El Numero que ingreso es MENOR a 15");
        else javax.swing.JOptionPane.showMessageDialog(null,"El Numero que ingreso es MAYOR a 15"); 
     }//Fin
 }//Fin

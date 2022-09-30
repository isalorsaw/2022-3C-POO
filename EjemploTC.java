import javax.swing.JOptionPane;
public class EjemploTC
{
    public static void main(String args[])
    {
        //String entrada=JOptionPane.showInputDialog("Ingrese un Caracter");
        //JOptionPane.showMessageDialog(null,"La letra que usd ingreso es "+entrada.charAt(0));
        

        int opcion=0;
        double op=0;
        
        
         try
         {
            String entrada=JOptionPane.showInputDialog("Ingresar");
            //opcion=Integer.parseInt(entrada);
            op=Double.parseDouble(entrada);
            JOptionPane.showMessageDialog(null,"Correcto! No entro al Catch");
         }
         catch(Exception exp)
         {
             //JOptionPane.showMessageDialog(null,exp);
             JOptionPane.showMessageDialog(null,"No es Valida la opcion ingresada");
         }
    }
}
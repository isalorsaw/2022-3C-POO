import javax.swing.JOptionPane;
public class MetodoString
{
    public static void main(String args[])
    { 
        //Declarar e Inicializar las variables
        String cadena="";
        String menu="";
        int opcion=0;
        boolean seguir=true; //Dos Estados: V/F true/false, 1/0
        
        do
        {
            cadena=JOptionPane.showInputDialog("Ingrese una Cadena");
            
            menu=JOptionPane.showInputDialog("OPCIONES DE MENU\n1. Tamaño de Cadena\n"+
            "2. Mostrar Letra en Pos\n3. Mostrar Primera Letra\n4. Mostrar Ultima Letra\n "+
            "5.Convertir a Minuscula\n6. Convertir a Mayuscula\n7. Invertir Cadena\n 8.Mostrar "+
            "las minusculas\n9. Mostrar las mayusculas\n10. Mostrar la letra de enmedio (Si es posible)\n"+
            "11.Remover Espacios\n12.Salir");
            opcion=Integer.parseInt(menu);
            
            switch(opcion)
            {
                case 1:
                    int t=cadena.length();
                    JOptionPane.showMessageDialog(null,"El tamaño de la Cadena "+cadena+" es: "+t);
                break;
                
                case 2:
                   String p=JOptionPane.showInputDialog("Ingrese una Posicion y le mostrare la letra de "+
                   cadena);
                   int pos=Integer.parseInt(p); 
                   char l=cadena.charAt(pos-1);
                   JOptionPane.showMessageDialog(null,"El caracter en la posicion "+pos+" es "+l);
                break;
                
                case 3:
                    char pl=cadena.charAt(0);
                    JOptionPane.showMessageDialog(null,"El Primer Caracter de "+cadena+" es "+pl);
                break;
                
                case 4:
                    t=cadena.length();
                    char ul=cadena.charAt(t-1);
                    JOptionPane.showMessageDialog(null,"El Ultimo Caracter de "+cadena+" es "+ul);
                break;
                
                case 5:
                    String minus=cadena.toLowerCase();
                    JOptionPane.showMessageDialog(null,"La cadena "+cadena+" en minusculas es "+minus);
                break;
                
                case 6:
                    String may=cadena.toUpperCase();
                    JOptionPane.showMessageDialog(null,"La cadena "+cadena+" en mayusculas es "+may);
                break;
                
                case 10:
                    t=cadena.length();
                    if(t%2==0)
                    {
                        JOptionPane.showMessageDialog(null,"No Hay Letra enmedio");
                        //No Hay letra enmedio
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"La Letra de enmedio es: ");
                        //SI Hay letra enmedio
                    }
                break;
                
                case 12:
                    seguir=false;
                break;
                
            }
        }while(seguir==true);///(seguir)
        JOptionPane.showMessageDialog(null,"Adios");
    }
}
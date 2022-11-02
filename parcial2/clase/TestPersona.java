package parcial2.clase;
import javax.swing.JOptionPane;
public class TestPersona
{
    public static void main(String args[])
    {
        Persona per[]=new Persona[5];
        
        for(int i=0;i<per.length;i++)
        {
            int edad=new BancoFM().aleatorio(10,50);
            per[i]=new Persona("",edad,' ');
        }
        
        
        //
        
        
        String info="";
        for(int i=0;i<per.length;i++)
        {
            info=info+"\n"+per[i].toString();
            
            boolean me=per[i].esMayorEdad();
            if(me)info+=" ES MAYOR DE EDAD ("+per[i].edad+")";
            else info+=" NO ES MAYOR DE EDAD ("+per[i].edad+")";
        }
        JOptionPane.showMessageDialog(null,info);
    }
}
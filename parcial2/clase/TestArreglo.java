package parcial2.clase;
import javax.swing.JOptionPane;
public class TestArreglo
{
    public static void main(String args[])
    {
        Producto p[]=new Producto[10];
        inicializar(p);
        imprimir(p);
        Producto p2[]=new Producto[10];
        inicializar(p2);
        
        int codigo=1;//pedirNumero("Favor ingresar el Codigo");
        String n="Tabcin";//pedirCadena("Favor Ingresar un Nombre de Producto");
        double precio=4;//pedirDouble("Favor Ingresar un Precio del Producto");
        double inv=0;//pedirDouble("Favor ingresar el inventario de Producto");
        ingresarProducto(codigo,n,precio,inv,p);
        imprimir(p);
    }
    public static void ingresarProducto(int c, String n, double p, double in,Producto pr[])
    {
        int i=0;
        while(i<pr.length)
        {
            if(pr[i].esVacio)
            {
                pr[i]=new Producto(c,n,p,in);
                i=pr.length;
            }
            i++;
        }
    }
    public static void imprimir(Producto pr[])
    {
        String mensaje="Contenido de Producto\n";
        for(int i=0;i<pr.length;i++)
        {
            mensaje+="Producto # "+(i+1)+"\n"+pr[i].toString()+"\n";
        }
        mensaje(mensaje);
    }
    public static void mensaje(String m)
    {
        JOptionPane.showMessageDialog(null,m);
    }
    public static void inicializar(Producto p[])
    {
        int i=0;
        while(i<p.length)
        {
            p[i]=new Producto();
            i++;
        }
    }
}
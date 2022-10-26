package parcial2.clase;
import javax.swing.JOptionPane;
public class Test
{
    public static void main(String args[])
    {
        //Declarando e Inicializando una Clase
        //Producto p=new Producto();
        
        int codigo=1;//pedirNumero("Ingrese el Codigo del Producto");
        String nombre="Panadoles";//pedirCadena("Ingrese el Nombre del Producto");
        double precio=5;//pedirDouble("INgrese el Precio del Producto");
        int inv=10;//pedirDouble("Ingrese el inventario del Producto");
        
        Producto p=new Producto(codigo,nombre,precio,inv);
        //Llamando toString para mostrar la Info de Producto
        JOptionPane.showMessageDialog(null,p.toString());
        
        Producto p1=new Producto(2,"Tabcin",3.40);
        JOptionPane.showMessageDialog(null,p1.toString());
        
        p1.setNombre("Tabcin Azul");
        JOptionPane.showMessageDialog(null,p1.toString());
        JOptionPane.showMessageDialog(null,p1.getNombre());
        
        //Aumentar en Inventario Producto
        p1.aumentarInv(10);
        JOptionPane.showMessageDialog(null,p1.toString());
        
        //Producto p2=new Producto(1);
        ///p1.nombre="OtroProducto";
        mensaje(p1.cargosa);
    }
}
package parcial2.clase;
public class Producto
{
    //atributos (privados y publicos)
    private int codigo;
    private String nombre;
    private double precio;
    private double inv;
    
    //constructores
    public Producto()//Constructor Vacio
    {
        this.codigo=0;
        this.nombre="";
        this.precio=0;
        this.inv=0;
    }
    public Producto(int codigo,String nombre,double precio,double inv)//Constructor con Parametros
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.inv=inv;
    }
    public Producto(int c, String n, double p)
    {
        this.codigo=c;
        this.nombre=n;
        this.precio=p;
        this.inv=0;
    }
    
    //metodos set
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setCodigo(int codigo)
    {
        this.codigo=codigo;
    }
    public void setPrecio(double precio)
    {
        this.precio=precio;
    }
    public void setInv(int inv)
    {
        this.inv=inv;
    }
    //funciones get
    public String getNombre()
    {
        return this.nombre;
    }
    public int getCodigo()
    {
        return this.codigo;
    }
    public double getPrecio()
    {
        return this.precio;
    }
    public double getInv()
    {
        return this.inv;
    }
    public void aumentarInv(int v)
    {
        this.inv+=v;
    }
    //toString() Mostrar la informacion de los atributos
    public String toString()
    {
        String m="Codigo "+codigo+"\nNombre "+nombre+"\nPrecio "+precio+"\nExistencia "+inv;
        return m;
    }
}
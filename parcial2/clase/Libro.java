package parcial2.clase;
public class Libro
{
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    //Constructor 1
    public Libro()
    {
        this.titulo="";
        this.autor="";
        this.ejemplares=0;
        this.prestados=0;
    }
    //Constructor 2
    public Libro(String t, String a, int e, int p)
    {
        titulo=t;
        autor=a;
        ejemplares=e;
        prestados=p;
    }
    //Constructor 3
    public Libro(String t, String a)
    {
        titulo=t;
        autor=a;
        ejemplares=0;
        prestados=0;
        //ejemplares=prestados=0;
    }
    public void agregar()
    {
        String titulo=new BancoFM().pedirCadena("Favor INgrese el Titulo del Libro");
        String autor=new BancoFM().pedirCadena("Favor INgrese el Autor del Libro");
        int ej=new BancoFM().pedirNumero("Favor INgrese El Numero de Ejemplares");
        setTitulo(titulo);
        setAutor(autor);
        setEjemplares(ej);
    }
    //Metodo de set
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    public void setAutor(String autor)
    {
        this.autor=autor;
    }
    public void setEjemplares(int ej)
    {
        this.ejemplares=ej;
    }
    public void setPrestados(int prest)
    {
        this.prestados=prest;
    }
    //Funciones de Get
    public String getAutor()
    {
        return autor;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public int getEjemplares()
    {
        return ejemplares;
    }
    public int getPrestados()
    {
        return prestados;
    }
    //Funcion devolucion
    public boolean devolucion()
    {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }
    //Funcion prestamo
    public boolean prestamo()
    {
        boolean prestado=true;
        if(prestados<ejemplares)
        {
             prestados++;
             //ejemplares--;
        }
        else
        {
            prestado=false;
        }
        return prestado;
    }
    //Funcion toString() para imprimir
    public String toString()
    {
        String info="Informacion del Libro\nTitulo: "+titulo+"\nAutor: "+autor+"\nEjemplares: "+
        ejemplares+"\nPrestados: "+prestados;
        return info;
    }
}
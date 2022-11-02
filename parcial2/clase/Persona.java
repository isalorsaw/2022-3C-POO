package parcial2.clase;
public class Persona
{
    public String nombre;
    public int edad;
    public String identidad;
    public char genero;
    public double peso;
    public double altura;
    public Persona(String n, int e, String i, char g, double p, double a)
    {
        nombre=n;
        edad=e;
        identidad=i;
        genero=g;
        peso=p;
        altura=a;
    }
    
    public Persona(String n, int e, char g)
    {
        nombre=n;
        edad=e;
        genero=g;
        identidad="";
        peso=0;
        altura=0;
    }
    public Persona()
    {
        nombre="";
        edad=0;
        genero=' ';
        identidad="";
        peso=0;
        altura=0;
    }
    public int calIMC()
    {
        return 0;
    }
    public boolean esMayorEdad()
    {
        boolean b=true;
        if(edad>=18)b=true;
        else b=false;
        return b;
    }
    public String toString()
    {
        return "Informacion de la Persona\nNombre: "+nombre+"\nEdad: "+edad+"\nGenero "+genero+"\nIdentidad: "+
        identidad+"\nPeso: "+peso+"\nAltura: "+altura;
    }
}

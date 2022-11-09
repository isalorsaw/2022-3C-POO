package parcial2.Juego;
abstract class Coordenada
{
    //Atributos
    private int x;
    private int y;
    
    //Constructores
    public Coordenada(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void setX(int x)
    {
        this.x=x;
    }
    void setY(int y)
    {
        this.y=y;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
}
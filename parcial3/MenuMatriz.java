package parcial3;
public class MenuMatriz
{
    public static int fila;
    public static int columna;
    public static void main(String args[])
    {
        fila=FM.pedirNumero("Ingrese el Numero de Filas para el Arreglo Bidimensional");
        columna=FM.pedirNumero("Ingrese el Numero de Columnas para el Arreglo Bidimensional");
        int m[][]=new int[fila][columna];
        boolean seguir=true;
        
        do
        {
            String menu="Menu\n1.Llenar Aleatorio\n2.Llenar Aleatorio Sin Repetirse\n3. Llenar con Valor\n4. Imprimir\n"+
            "5. Buscar Valor\n0.Salir";
            int opcion=FM.pedirNumero(menu);
            switch(opcion)
            {
                case 1:
                    int d=FM.pedirEntero("Ingrese Desde donde voy a partir");
                    int h=FM.pedirEntero("Ingrese Hasta donde voy a llegar");
                    llenarAleatorio(m,d,h);
                break;
                
                case 2:
                    int d=FM.pedirEntero("Ingrese Desde donde voy a partir");
                    int h=FM.pedirEntero("Ingrese Hasta donde voy a llegar");
                    llenarAleatorioSR(m,d,h);
                break;
                    
                case 3:
                    int v=FM.pedirEntero("Ingrese un Valor para Rellenar el Arreglo");
                    llenarValor(m,v);
                break;
                    
                case 4:
                    String c=imprimirF(m);//Funcion
                    imprimirM(m);//Metodo
                break;
                    
                case 5:
                    int v=FM.pedirEntero("Ingrese un Valor para buscar en la Matriz");
                    boolean b=buscarValor(m,v);
                    if(b)FM.Mensaje(v+" Si se encuentra dentro del Arreglo");
                    else FM.Mensaje(v+" No se encuentra dentro del Arreglo");
                break;
                    
                case 0:
                    seguir=false;
                break;
            }
        }while(seguir);
    }
}
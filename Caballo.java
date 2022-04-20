public class Caballo 
{
    String nombre = "Fausto";

    String edad= "1 año";

    String color = "anaranjado";

    void correr()
    {
        System.out.println("Corre por el campo"); 
    }
 public static void main(String[] args)
 {
     Caballo caballo = new Caballo();

     System.out.println(caballo.nombre);

     System.out.println(caballo.edad);

     System.out.println(caballo.color);

     caballo.correr();
 }   
    
}

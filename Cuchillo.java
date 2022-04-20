public class Cuchillo 
{
    String tamanio = "normal";

    String marca = "Tramontina";

    String color = "Marron";

    void cortar()
    {
        System.out.println("corta frutas, verduras,etc"); 
    }
 public static void main(String[] args)
 {
     Cuchillo cuchillo = new Cuchillo();

     System.out.println(cuchillo.tamanio);

     System.out.println(cuchillo.marca);

     System.out.println(cuchillo.color);

     cuchillo.cortar();

 }   
    
}

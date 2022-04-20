public class Taller 
{
    String direccion = "jr. San martin 456";

    String ciudad = "Lima";

    String rubro = "Textil";

    void confeccionar()
    {
        System.out.println("Confeccion de prendas"); 
    }
 public static void main(String[] args)
 {
    Taller taller = new Taller();

     System.out.println(taller.direccion);

     System.out.println(taller.ciudad);

     System.out.println(taller.rubro);

     taller.confeccionar();

 }   
}

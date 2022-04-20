public class Licuadora 
{
    String marca = "Oster";

    String modelo = "Oster 465-42";

    String color = "Verde";

    void triturar()
    {
        System.out.println("triturar las frutas"); 
    }
 public static void main(String[] args)
 {
     Licuadora licuadora = new Licuadora();

     System.out.println(licuadora.marca);

     System.out.println(licuadora.modelo);

     System.out.println(licuadora.color);

     licuadora.triturar();

 }   
}

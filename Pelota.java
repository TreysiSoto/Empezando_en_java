public class Pelota 
{
    String tamanio = "De tamanio mediano";

    String color = "La Pelota es negra";

    String material = "Está hecho de Caucho";

    void rebotar()
     {
         System.out.println("Rebota en la pared");
     }
    public static void main(String[] args)
         {
            Pelota pelota = new Pelota();
      
            System.out.println(pelota.tamanio);

            System.out.println(pelota.color);

            System.out.println(pelota.material);
      
            pelota.rebotar();
        }
}

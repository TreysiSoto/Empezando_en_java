public class Computadora 
{
    String marca= "Hp";

    String procesador = "Intel";

    String memoria = "8 Gb";

    void ejecutar()
     {
         System.out.println("Ejecutar programas");
     }
    public static void main(String[] args)
         {
            Computadora computadora = new Computadora();
      
            System.out.println(computadora.marca);

            System.out.println(computadora.procesador);

            System.out.println(computadora.memoria);
      
            computadora.ejecutar();
        }
}

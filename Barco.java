class Barco 
{
    String modelo = "Velero clasico";

    String marca = "Cobalt";

    String color = "Blanco";

    void recibir()
     {
         System.out.println("Recibir a los tripulantes");
     }
    public static void main(String[] args)
         {
            Barco barco = new Barco();
      
            System.out.println(barco.modelo);

            System.out.println(barco.marca);

            System.out.println(barco.color);
      
            barco.recibir();
        }
}

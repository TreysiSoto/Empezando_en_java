public class Radio
{
    String tamanio= "Mediano";

    String color = "Negro";

    String modelo = "Portatil";

    void informar()
     {
         System.out.println("Informar sobre diferentes temas");
     }
    public static void main(String[] args)
         {
            Radio radio = new Radio();
      
            System.out.println(radio.tamanio);

            System.out.println(radio.color);

            System.out.println(radio.modelo);
      
            radio.informar();
        }
    
}

public class Revista 
{
    String nombre= "Somos";

    String compañia = "El comercio";

    String categoria = "Varios";

    String estilo = "Coloquial";

    void entretener()
     {
         System.out.println("Entretener a las personas con el contenido");
     }
    public static void main(String[] args)
         {
            Revista revista = new Revista();

            System.out.println(revista.nombre);
           
            System.out.println(revista.compañia);
          
            System.out.println(revista.categoria);
           
            System.out.println(revista.estilo);
      
            revista.entretener();
        }
}

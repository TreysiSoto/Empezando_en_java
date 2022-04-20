class Libreria 
{
    String nombre = "Libreria Maryorith";

    String direccion = "Calle los girasoles SJL" ;

    String nomPropietario = "Juanita Guerra Jimenez";

    void vender()
     {
         System.out.println("Venta de utiles escolares");
     }
    public static void main(String[] args)
         {
            Libreria libreria = new Libreria();
      
            System.out.println(libreria.nombre);

            System.out.println(libreria.direccion);

            System.out.println(libreria.nomPropietario);
      
            libreria.vender();
        }
    
}

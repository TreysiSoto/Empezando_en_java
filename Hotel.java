public class Hotel 
{
    String direccion = "Jr.Las margaritas";
    
    String nombre = "Los puesta del sol";

    String numHabitaciones = "8 habitaciones";
    
    void registrar()
     {
         System.out.println("Registrar datos de los clientes");
     }
    public static void main(String[] args)
         {
            Hotel hotel = new Hotel();
      
            System.out.println(hotel.direccion);

            System.out.println(hotel.nombre);

            System.out.println(hotel.numHabitaciones);
      
            hotel.registrar();
        }
    
}

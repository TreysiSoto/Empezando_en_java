class Perro 
{
    String nombre = "Chester";

    String raza = "Pitbull";

    String color = "Blanco con marron";

    void ladrar()
     {
         System.out.println("Ladra en la noche");
     }
    public static void main(String[] args)
         {
            Perro perro = new Perro();
      
            System.out.println(perro.nombre);

            System.out.println(perro.raza);

            System.out.println(perro.color);
      
            perro.ladrar();
        }
    
}

class Lavadora 
{
    String marca = "Samsung";

    String tipo = "De carga superior";

    String capacidad= "24 Kg";

    void agregar()
     {
         System.out.println("Agregar detergente");
     }
    public static void main(String[] args)
         {
            Lavadora lavadora = new Lavadora();
      
            System.out.println(lavadora.marca);

            System.out.println(lavadora.tipo);
        
            System.out.println(lavadora.capacidad);
      
            lavadora.agregar();
        }
    
}

class Television 
{
    String estado = "Nuevo";

    String marca = "LG";

    String modelo = "Led";

    void cambiar()
     {
         System.out.println("Cambiar de canal");
     }
    public static void main(String[] args)
         {
            Television  television = new Television();
      
            System.out.println(television.estado);

            System.out.println(television.marca);

            System.out.println(television.modelo);
      
            television.cambiar();
        }
    
}

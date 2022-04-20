class Avion 
{
    String modelo = "Airbus";

    String cantMotor = "Tiene 4 motores";

    String capacidad = "538 asientos";

    void elevar()
     {
         System.out.println("Elevarse en el aire");
         
     }
    public static void main(String[] args)
         {
            Avion avion = new Avion();
      
            System.out.println(avion.modelo);

            System.out.println(avion.cantMotor);
            
            System.out.println(avion.capacidad);
      
            avion.elevar();
        }
    
}

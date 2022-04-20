class Persona 
{
  String nombre = "Rosa";

  String apellido = "Gutierrez";

  String direccion = "jr.Las palmeras";

  void comer()
  {
      System.out.println("Come a las 12 horas");
  }
  public static void main(String[] args)
    {
         Persona persona = new Persona();

         System.out.println(persona.nombre);

         System.out.println(persona.apellido);

         System.out.println(persona.direccion);

         persona.comer();
    }

}

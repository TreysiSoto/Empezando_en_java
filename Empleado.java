public class Empleado 
{
    String nombre = "Feliciano";

    String dni= "74321567";

    String telefono = "+51 934778239";

    void enviar()
    {
        System.out.println("Enviar productos de una empresa"); 
    }
 public static void main(String[] args)
 {
     Empleado empleado = new Empleado();

     System.out.println(empleado.nombre);

     System.out.println(empleado.dni);

     System.out.println(empleado.telefono);

     empleado.enviar();

 }   
    
}

public class Curso
{
    String nombre= "Base de datos";

    String dias = "Viernes y sabado";

    String horaInicio = "8:15 am";

    String horaFin = "9:30 am";

    String nomDocente = "Ing.Antonio";

    void generarLista()
     {
         System.out.println("Genera la lista de alumnos matriculados");
     }
    public static void main(String[] args)
         {
            Curso curso = new Curso();
      
            System.out.println(curso.nombre);

            System.out.println(curso.dias);
            System.out.println(curso.horaInicio);
            System.out.println(curso.horaFin);
            System.out.println(curso.nomDocente);
      
            curso.generarLista();
        }
    
}

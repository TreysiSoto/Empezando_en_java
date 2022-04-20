public class AgenciaViajes 
{
    String nombre = "GM Internacional";

    String destino = "Lima - Huanuco";

    String direccion = "Jr.Luna Pizarro - La victoria";

    void asignar()
    {
        System.out.println("Asignar asientos a cada pasajero");
    }
    
    public static void main(String[] args)
    {
        AgenciaViajes agenciaViajes = new AgenciaViajes();

        System.out.println(agenciaViajes.nombre);

        System.out.println(agenciaViajes.destino);

        System.out.println(agenciaViajes.direccion);

        agenciaViajes.asignar();
    }
}

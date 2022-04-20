public class Artista 
{
    String nombre = "Daniela";

    String nacionalidad= "Peruana";

    String edad = "32 años";

    String especialidad = "cantante";

    void componer()
    {
        System.out.println("Componer letras de las canciones");
    }

    public static void main(String[] args)
    {
        Artista artista = new Artista();

        System.out.println(artista.nombre);

        System.out.println(artista.nacionalidad);

        System.out.println(artista.edad);

        System.out.println(artista.especialidad);

        artista.componer();
    }
    
}

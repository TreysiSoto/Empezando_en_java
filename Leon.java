public class Leon
{
    String color = "Anaranjado con amarillo";

    String especie = "Carnívoro";

    String edad = "2 años";

    String tamanio = "mediano";

    void comer()
    {
        System.out.println("Come carne");
    }
    public static void main(String[] args)
    {
        Leon leon = new Leon();

        System.out.println(leon.color);

        System.out.println(leon.especie);

        System.out.println(leon.edad);

        System.out.println(leon.tamanio);
    }
}

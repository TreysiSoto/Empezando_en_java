public class Moto 
{
    String color = "Azul";

    String marca = "Honda";

    String numPlaca = "B3tr5v";

    String velMax = " 120 km/h";

    void acelerar()
    {
        System.out.println("Acelera para ir mas rapido");
    }

    public static void main(String[] args)
    {
        Moto moto = new Moto();

        System.out.println(moto.color);

        System.out.println(moto.marca);

        System.out.println(moto.numPlaca);

        System.out.println(moto.velMax);

        moto.acelerar();


    }
}

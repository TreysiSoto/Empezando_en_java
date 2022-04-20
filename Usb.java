public class Usb 
{
    String marca = "Kingston";

    String cantGb = "32 Gb";

    String color = "Verde";

    void almacenar()
    {
        System.out.println("Almacenar archivos"); 
    }
 public static void main(String[] args)
 {
     Usb usb = new Usb();

     System.out.println(usb.marca);

     System.out.println(usb.cantGb);

     System.out.println(usb.color);

     usb.almacenar();

 }   
}

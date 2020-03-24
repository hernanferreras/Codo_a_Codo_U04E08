
package u04e08;
import java.util.Scanner;
public class U04E08 {

    public static void main(String[] args) {
        int edad;
        char sexo;
        String mensajeSI= ("Se puede jubilar");
        String mensajeNO= ("No se puede jubilar");
        String mensajeEdad = ("Ingrese la edad: ");
        System.out.print(mensajeEdad);
        Scanner entrada = new Scanner(System.in);
        edad = entrada.nextInt();
        while (edad<1 || edad >120){
            System.out.print("Ingreso mal la edad\n"+mensajeEdad);
            edad =entrada.nextInt();
            
        }
            System.out.print("Ingrese el sexo: ");
        sexo = entrada.next().charAt(0);
        switch (sexo){
            case 'F':
                if (edad>=60) {
                System.out.print(mensajeSI);
                }
                else{
                System.out.print (mensajeNO);
                }
            break;
            case 'M':
                if (edad>=65) {
                System.out.print(mensajeSI);
                }
                else{
                System.out.print (mensajeNO);
                }
            break;
            default:
            System.out.print("Ingreso mal el sexo");
            }
    }
}

package clase_26_09;

import java.util.Locale;
import java.util.Scanner;

/* Pide un numero real que represente a un precio y muestra el precio con IVA. El IVA es del 21%

 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        final double IVA = 0.21;
        System.out.println("Ingrese el precio");
        double precioSinIva = sc.nextDouble();
        double precioConIva = precioSinIva * (1 + IVA);
    }

}
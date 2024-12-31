
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = teclado.nextInt();

            if (opcion == 9) {
                System.out.println("Gracias por usar el conversor de monedas. ¡Hasta pronto!");
                continuar = false;
                break;
            }
            boolean adelante = true;
            while (adelante) {
                if (opcion > 9 || opcion <= 0) {
                    System.out.println("Opción no válida. Intente nuevamente.");
                    opcion = teclado.nextInt();
                    if (opcion == 9) {
                        System.out.println("Gracias por usar el conversor de monedas. ¡Hasta pronto!");
                        break;
                    }
                }else {adelante = false;}
            }
            System.out.print("Ingrese la cantidad que desea convertir: ");
            double cantidad = teclado.nextDouble();

            switch (opcion) {
                case 1 -> ConvertirMoneda.convertir("MXN", "USD", cantidad);
                case 2 -> ConvertirMoneda.convertir("ARS", "USD", cantidad);
                case 3 -> ConvertirMoneda.convertir("BRL", "USD", cantidad);
                case 4 -> ConvertirMoneda.convertir("COP", "USD", cantidad);
                case 5 -> ConvertirMoneda.convertir("USD", "MXN", cantidad);
                case 6 -> ConvertirMoneda.convertir("USD", "ARS", cantidad);
                case 7 -> ConvertirMoneda.convertir("USD", "BRL", cantidad);
                case 8 -> ConvertirMoneda.convertir("USD", "COP", cantidad);
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }

        }

        teclado.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n***************************************************");
        System.out.println("Bienvenido al conversor de monedas lista de divisas");
        System.out.println("\n||---------  DE DIVISAS A --> DOLAR  ------------||");
        System.out.println("1) MXN --> USD    Peso Mexicano   / Dolar Estadounidense\n2) ARS --> USD    Peso Argentino  / Dolar Estadounidense");
        System.out.println("3) BRL --> USD    Real Brasileño  / Dolar Estadounidense\n4) COP --> USD    Peso Colombiano / Dolar Estadounidense");
        System.out.println("||---------  DE DOLAR A --> DIVISAS  ------------||");
        System.out.println("5) USD --> MXN    Dolar Estadounidense / Peso Mexicano\n6) USD --> ARS    Dolar Estadounidense / Peso Argentino");
        System.out.println("7) USD --> BRL    Dolar Estadounidense / Real Brasileño\n8) USD --> COP    Dolar Estadounidense / Peso Colombiano");


        System.out.println("\n9) SALIR");
        System.out.println("***************************************************");
        System.out.println("Elija una opción válida:");
    }
}
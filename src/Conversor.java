import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        String solicitudEntradaUsuario = "A continuación, ingrese el valor que desea convertir";
        String mensajeOpcionElegida = "Usted eligió la opción:";
        int valorPrueba = 1000;//prueba

        String menu = " *** Bienvenido(a) al Conversor de monedas ***                \n" +
                "                1 - Dólar ==> Peso argentino\n" +
                "                2 - Peso argentino ==> Dólar\n" +
                "                3 - Dólar ==> Real brasileño\n" +
                "                4 - Real brasileño ==> Dólar\n" +
                "                5 - Dólar ==> Peso colombiano\n" +
                "                6 - Peso colombiano ==> Dólar\n" +
                "                7 - Salir\n" +
                "Por favor, elija una opción válida:                \n";

        //al elegir la opción 7, finaliza el programa
        while (opcion != 7) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(mensajeOpcionElegida);
                    System.out.println("Convertir de Dólar ==> Peso argentino:\n");
                    System.out.println(solicitudEntradaUsuario);
                    double valorDolar = teclado.nextDouble();


//                    int valorARetirar = 500;
//                    if (valorPrueba < valorARetirar){
//                        System.out.println("Saldo insuficiente");
//                    } else {
//                        valorPrueba = valorPrueba - valorARetirar;
//                        System.out.println("El saldo actualizado es: $" + valorPrueba);
//                    }
                    break;
                case 2:
                    System.out.println(mensajeOpcionElegida);
                    System.out.println("Convertir de Peso argentino ==> Dólar\n");
                    System.out.println(solicitudEntradaUsuario);
                    double valorPesos = teclado.nextDouble();
                    break;
                case 3:
                    System.out.println(mensajeOpcionElegida);
                    System.out.println("Convertir de Dólar ==> Real brasileño\n");
                    System.out.println(solicitudEntradaUsuario);
                    double valorDolarAReal = teclado.nextDouble();
                    break;
                case 4:
                    System.out.println(mensajeOpcionElegida);
                    System.out.println("Convertir de Real brasileño ==> Dólar\n");
                    System.out.println(solicitudEntradaUsuario);
                    double valorReal = teclado.nextDouble();
                    break;
                case 5:
                    System.out.println(mensajeOpcionElegida);
                    System.out.println("Convertir de Dólar ==> Peso colombiano\n");
                    System.out.println(solicitudEntradaUsuario);
                    double valorDolarACol = teclado.nextDouble();
                    break;
                case 6:
                    System.out.println(mensajeOpcionElegida);
                    System.out.println("Convertir de Peso colombiano ==> Dólar\n");
                    System.out.println(solicitudEntradaUsuario);
                    double valorColombianos = teclado.nextDouble();
                    break;
                case 7:
                    System.out.println("Saliendo del programa. Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

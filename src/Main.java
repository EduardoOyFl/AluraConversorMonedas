import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException  {
        String base="";
        String destino="";
        double cantidad = 0;
        double cantidadEquivalente = 0;

        Conversor consulta = new Conversor();

        try {
            Scanner scanner = new Scanner(System.in);
            int opcion = 0;

            while(opcion != 7) {

                System.out.println("**************************************************");

                System.out.println("Bienvenido al Sistema Conversor de Monedas");
                System.out.println("1) Dólar ==> Peso Chileno ");
                System.out.println("2) Peso Chile ==> Dólar ");
                System.out.println("3) Dólar ==> Peso Argentino ");
                System.out.println("4) Peso Argentino ==> Dólar ");
                System.out.println("5) Dólar ==> Real Brasileño ");
                System.out.println("6) Real Brasileño ==> Dólar ");
                System.out.println("7) Salir ");
                System.out.println("Seleccione una opción: ");
                opcion = scanner.nextInt();

                System.out.println("***************************************************");

                switch (opcion) {
                    case 1:
                        base ="USD";
                        destino = "CLP";
                        break;
                    case 2:
                        base ="CLP";
                        destino = "USD";
                        break;
                    case 3:
                        base ="USD";
                        destino = "ARS";
                        break;
                    case 4:
                        base ="ARS";
                        destino = "USD";
                        break;
                    case 5:
                        base ="USD";
                        destino = "BRL";
                        break;
                    case 6:
                        base ="BRL";
                        destino = "USD";
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;                }

                if(opcion >= 1 && opcion <=6){
                    System.out.print("Ingrese la cantidad a convertir: ");
                    cantidad = scanner.nextDouble();

                    Moneda moneda = consulta.getConversion(base,destino,cantidad);
                    cantidadEquivalente = cantidad * moneda.conversion_rate();
                    System.out.println("El Equivalente de " + cantidad + " " + base + " a =>> " + destino + " es = " +
                            cantidadEquivalente + " " + destino);
                    System.out.println("Presione cualquier tecla para continuar...");
                    System.in.read();
                }
                else if(opcion == 7){
                    break; // sale de While
                }

            }
        }catch (Exception e){
            System.out.println("Oh! Error inesperado: " + e.getMessage());
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();

        int numeroDePelicula;
        while (true) {
            System.out.println("Escriba el número de la película de Star Wars que quiere consultar (1-7):");
            System.out.println("Para salir ingrese 8");
            try {
                numeroDePelicula = Integer.valueOf(lectura.nextLine());
                if (numeroDePelicula <= 7) {
                    Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);
                    System.out.println(pelicula);
                    GeneradorDeArchivo generador = new GeneradorDeArchivo();
                    generador.guardarJson(pelicula);
                } else {
                    System.out.println("Número superior a 7. Finalizando la aplicación.");
                    break; // Salir del bucle
                }
            } catch (NumberFormatException e) {
                System.out.println("Número no válido: " + e.getMessage());
            } catch (RuntimeException | IOException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Finalizando la aplicación.");
                break; // Salir del bucle
            }
        }
        lectura.close(); // Cerrar el scanner al finalizar
    }
}

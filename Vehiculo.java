// Importamos la clase Scanner de la librería java.util
// Nos permitirá leer datos ingresados por el usuario desde el teclado
import java.util.Scanner;

// Declaramos la clase principal llamada Vehiculo
public class Vehiculo {
    // Método principal: punto de entrada del programa
    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado 'sc' para leer datos desde consola
        Scanner sc = new Scanner(System.in);

        // Declaración de variables para almacenar los datos del vehículo
        String marca;        // Marca del vehículo (texto)
        String modelo;       // Modelo del vehículo (texto)
        int cilindrada;      // Cilindrada del vehículo (número entero, en cc)
        String combustible;  // Tipo de combustible (texto)
        int capacidad;       // Capacidad de pasajeros (número entero)

        // Solicitamos al usuario ingresar cada dato y lo guardamos en variables
        System.out.print("Ingrese la marca: "); // Mensaje en pantalla
        marca = sc.nextLine(); // Lectura de texto para la marca

        System.out.print("Ingrese el modelo: "); // Mensaje en pantalla
        modelo = sc.nextLine(); // Lectura de texto para el modelo

        System.out.print("Ingrese la cilindrada (en cc): "); // Mensaje en pantalla
        cilindrada = sc.nextInt(); // Lectura de un número entero para cilindrada

        sc.nextLine(); // Limpieza del buffer (evita errores al leer después un String)

        System.out.print("Ingrese el tipo de combustible: "); // Mensaje en pantalla
        combustible = sc.nextLine(); // Lectura de texto para combustible

        System.out.print("Ingrese la capacidad en pasajeros: "); // Mensaje en pantalla
        capacidad = sc.nextInt(); // Lectura de un número entero para capacidad

        // Mostramos en pantalla los datos ingresados por el usuario
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        // Cerramos el objeto Scanner para liberar recursos
        sc.close();
    }
}

import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

public class NombreEdad { // Declaración de la clase principal
    public static void main(String[] args) { // Punto de entrada de la aplicación
        Scanner sc = new Scanner(System.in); // Crea el objeto Scanner 'sc' para capturar entradas

        String nombre; // Variable de texto para el nombre
        int edad;      // Variable entera para la edad

        System.out.print("Ingrese su nombre: "); // Solicita el nombre al usuario
        nombre = sc.nextLine(); // Lee la línea de texto completa y la asigna a 'nombre'

        System.out.print("Ingrese su edad: "); // Solicita la edad
        edad = sc.nextInt(); // Lee un número entero y lo asigna a 'edad'

        // Muestra los datos ingresados
        System.out.println("\nNombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + edad);

        sc.close(); // Cierra el Scanner
    }
}

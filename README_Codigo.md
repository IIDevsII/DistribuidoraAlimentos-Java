# Código Documentado

A continuación se documenta cada línea de los dos programas: **Vehiculo** y **NombreEdad**.

---

## 1) Vehiculo.java

```java
import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

public class Vehiculo { // Declaración de la clase principal
    public static void main(String[] args) { // Método principal donde inicia la ejecución del programa
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner denominado 'sc' para capturar entradas desde consola

        String marca;       // Variable de tipo texto para almacenar la marca
        String modelo;      // Variable de tipo texto para almacenar el modelo
        int cilindrada;     // Variable numérica entera para la cilindrada (en cc)
        String combustible; // Variable de tipo texto para el tipo de combustible
        int capacidad;      // Variable entera para la cantidad de pasajeros

        System.out.print("Ingrese la marca: "); // Muestra un mensaje pidiendo la marca
        marca = sc.nextLine(); // Lee la línea completa ingresada por el usuario y la asigna a 'marca'

        System.out.print("Ingrese el modelo: "); // Solicita el modelo
        modelo = sc.nextLine(); // Lee y asigna el modelo a la variable 'modelo'

        System.out.print("Ingrese la cilindrada (en cc): "); // Solicita cilindrada
        cilindrada = sc.nextInt(); // Lee un número entero y lo asigna a 'cilindrada'

        sc.nextLine(); // Limpia el buffer del Scanner para evitar saltos en lecturas posteriores de String

        System.out.print("Ingrese el tipo de combustible: "); // Solicita el tipo de combustible
        combustible = sc.nextLine(); // Lee y asigna el tipo de combustible

        System.out.print("Ingrese la capacidad en pasajeros: "); // Solicita capacidad de pasajeros
        capacidad = sc.nextInt(); // Lee un entero y lo asigna a 'capacidad'

        // Muestra en pantalla los datos ingresados
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        sc.close(); // Cierra el objeto Scanner para liberar recursos
    }
}

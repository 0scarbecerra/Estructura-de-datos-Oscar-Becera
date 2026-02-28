/**
 * Taller Práctico - Unidad 1
 * Tema: Arrays y Programación Estructurada
 *
 * Este programa gestiona un array de números enteros y realiza
 * operaciones básicas: mostrar, suma, promedio y valor máximo.
 */
public class Main  {

    public static void main(String[] args) {
        // Definimos un array con al menos 8 valores (asignación directa)
        int[] datos = {5, 12, 8, 3, 20, 1, 15, 7};

        // Mostrar todos los valores
        System.out.println("=== Valores del array ===");
        mostrarValores(datos);

        // Calcular y mostrar la suma
        int suma = calcularSuma(datos);
        System.out.println("\nSuma total: " + suma);

        // Calcular y mostrar el promedio
        double promedio = calcularPromedio(datos);
        System.out.printf("Promedio: %.2f%n", promedio);

        // Obtener y mostrar el valor mayor
        int mayor = obtenerMayor(datos);
        System.out.println("Valor mayor: " + mayor);
    }

    /**
     * Muestra todos los elementos del array por consola.
     * @param datos Array de enteros a mostrar.
     */
    public static void mostrarValores(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println(); // Salto de línea al final
    }

    /**
     * Calcula la suma de todos los elementos del array.
     * @param datos Array de enteros.
     * @return Suma total de los valores.
     */
    public static int calcularSuma(int[] datos) {
        int suma = 0;
        for (int valor : datos) {
            suma += valor;
        }
        return suma;
    }

    /**
     * Calcula el promedio de los elementos del array.
     * Se utiliza un bucle for tradicional para variar el estilo.
     * @param datos Array de enteros.
     * @return Promedio como valor double.
     */
    public static double calcularPromedio(int[] datos) {
        int suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        // Promedio como double para mantener precisión decimal
        return (double) suma / datos.length;
    }

    /**
     * Encuentra el valor máximo dentro del array.
     * @param datos Array de enteros.
     * @return El valor más grande.
     */
    public static int obtenerMayor(int[] datos) {
        if (datos.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        int mayor = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > mayor) {
                mayor = datos[i];
            }
        }
        return mayor;
    }
}
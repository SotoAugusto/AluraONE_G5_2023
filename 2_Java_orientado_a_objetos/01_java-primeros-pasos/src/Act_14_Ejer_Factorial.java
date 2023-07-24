public class Act_14_Ejer_Factorial {
    public static void main(String[] args) {
//        En este ejercicio opcional, tu desafío es imprimir los factoriales del 1 al 10.
//
//¿Recuerdas el factorial? ¿No? No hay problema, sigue las reglas:
//
//El factorial de 0 es 1.
//El factorial de 1 es (0!) * 1 = 1.
//El factorial de 2 es (1!) * 2 = 2
//El factorial de 3 es (2!) * 3 = 6
//El factorial de 4 es (3!) * 4 = 24
//El factorial de un número n es n * n-1 * n-2 ... hasta n = 1.
//O sea:
//
//El factorial de 4! = 1 x 2 x 3 x 4 = 24
//El factorial de 6! = 1 x 2 x 3 x 4 x 5 x 6 = 720
//Ahora crea una nueva clase, escribe un for que comience una variable n (número actual) como 1 y factorial (resultado total) como 1. ¡Haz su ciclo entre 1 y 10 y calcula el resultado!
        int factorial = 6;
        int numeroActual = 1;
        for (int i = 1; i <= factorial; i++) {
            numeroActual *= i;
        }
            System.out.println(factorial+"!: "+numeroActual);
    }
}
public class Act_12_Ejer_triangulo {
    public static void main(String[] args) {
        for(int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                if ( fila < columna ) {
                    break;
                }
                System.out.print( columna + 1);
            }
            System.out.println();
        }

        System.out.println();

        for(int fila = 0; fila < 15; fila++) {
            for (int columna = 0; columna < 15; columna++) {
                if ( fila < columna ) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
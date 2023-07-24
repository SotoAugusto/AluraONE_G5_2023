public class Act_13_Ejer_mult_tres {
    public static void main(String[] args) {


//        Usa un bucle for para imprimir todos los múltiplos de 3, entre 1 y 100.
//
//Consejo: Hay dos formas tradicionales de resolver este problema. Una es hacer el for y usar el número% 3 para encontrar el residuo de dividir un número entre 3 (el operador % se llama módulo). Si el residuo es cero, es divisible por 3. Como en:
//
//if (numero% 3 == 0) {
//    // hacer algo
//}
//Otro enfoque es hacer un bucle ligeramente diferente, que salta directamente a través de múltiplos de tres. ¡Hay otros enfoques, elige el tuyo e impleméntalo en una nueva clase!

        System.out.println("Alternativa 1");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }

        System.out.println("Alternativa 2");
        for (int i = 3; i < 100; i += 3 ){
            System.out.println(i);
        }
    }
    }

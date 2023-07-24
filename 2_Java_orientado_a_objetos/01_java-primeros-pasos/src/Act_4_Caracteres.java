public class Act_4_Caracteres {
    public static void main(String[] args) {
        char caracter = 'a';
        String cadena = "cadena";
        System.out.println("char = "+caracter);
        System.out.println("String = "+cadena);

        caracter = 1233;
        System.out.println("cuando se le asigna un int a un char, sigue la tabla ascii y muestra el char que representa: \n " + caracter);
    }
}
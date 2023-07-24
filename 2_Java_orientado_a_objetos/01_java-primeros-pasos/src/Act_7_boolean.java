public class Act_7_boolean {
    public static void main(String[] args) {
        System.out.println();
        int edad = 32;
        int cantidadPersonas = 2;
        boolean esPareja = cantidadPersonas > 1;
            //solo entra si es mayor de edad y viene acompañado

        boolean puedeEntrar = edad >= 18 && esPareja;


        System.out.println("El valor de la condicion booleana es: " + esPareja);

        if (puedeEntrar) {
            System.out.println("mayor de edad y acompañado, puede entrar");
        } else {
            if (cantidadPersonas >= 2) {
                System.out.println("menor de edad, pero se permite el ingreso por estar acompañado");
            } else {
                System.out.println("menor de edad y no está acompañado, no puede entrar");

            }
        }
    }
}
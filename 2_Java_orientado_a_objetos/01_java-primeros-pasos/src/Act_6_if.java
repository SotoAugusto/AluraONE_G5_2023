public class Act_6_if {
    public static void main(String[] args) {
        System.out.println();
        int edad = 32;
        int cantidadPersonas = 1;

        if (edad >= 18) {
            System.out.println("mayor de edad, puede entrar");
        } else {
            if (cantidadPersonas >= 2) {
                System.out.println("menor de edad, pero se permite el ingreso por estar acompañado");
            } else {
                System.out.println("menor de edad y no está acompañado, no puede entrar");

            }

        }
    }
}
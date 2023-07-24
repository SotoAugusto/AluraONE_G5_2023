public class Act_9_Ejer_Alcance {
    public static void main(String[] args) {
        int edad = 20;
        int cantidadPersonas = 3;
//        esta variable se debe crear fuera para que pueda ser usado en otros lugares
        boolean acompañado  = true;

        if (cantidadPersonas >= 2) {
            // si inicializo la variable aquí, solo existe dentro de este if
//            boolean acompañado  = true;

             acompañado  = true;
        } else {
//            boolean acompañado  = false;

             acompañado = false;
        }

        if (edad >= 18 || acompañado) {
            System.out.println ("Bienvenido");
        } else {
            System.out.println ("desafortunadamente no puedes ingresar");
        }
    }
}
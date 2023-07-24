public class Act_10_switch {

    public static void main (String [] args) {

        int mes = 10;

        switch (mes) {
            case 1 -> System.out.println("El mes es enero");
            case 2 -> System.out.println("El mes es febrero");
            case 3 -> System.out.println("El mes es marzo");
            case 4 -> System.out.println("El mes es abril");
            case 5 -> System.out.println("El mes es mayo");
            case 6 -> System.out.println("El mes es junio");
            case 7 -> System.out.println("El mes es julio");
            case 8 -> System.out.println("El mes es agosto");
            case 9 -> System.out.println("El mes es septiembre");
            case 10 -> System.out.println("El mes es octubre");
            case 11 -> System.out.println("El mes es noviembre");
            case 12 -> System.out.println("El mes es diciembre");
            default -> System.out.println("Mes inválido");
        }

    }
}
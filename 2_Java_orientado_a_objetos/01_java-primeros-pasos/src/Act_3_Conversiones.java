public class Act_3_Conversiones {
    public static void main(String[] args) {
        double variable1 = 230.83;
//        convertir variable1 (double) y pasarla a una variable INTEGER
        int variable1Entero = (int) variable1;
        System.out.println(variable1Entero);

        System.out.println("long tiene que finalizar con una 'L'");
        long enteroLargo = 1235767785675534586L;
        System.out.println(enteroLargo);

        System.out.println("tipo de dato short");
        short numeroShort = 12312;
        System.out.println(numeroShort);

        System.out.println("tipo de dato byte");
        byte numeroByte = 112;
        System.out.println(numeroByte);

        System.out.println("tipo de dato float, tiene que finalizar con una 'F'");
        float numeroFloat = 123123.23F;
        System.out.println(numeroFloat);

    }
}
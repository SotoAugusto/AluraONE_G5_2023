public  class Act_5_ValoresVariables {
    public static void main(String[] args) {
        int numero1 = 4;
        int numero2 = 6;

        System.out.println("int numero1 = 4;\n" +
                "int numero2 = 6;\n" +
                "numero 2:");
        System.out.println(numero2);



        numero2 = numero1;
        System.out.println("numero2 = numero1;");

        numero1 = 88;
        System.out.println("numero1 = 88;");
        System.out.println("numero 2:");
        System.out.println(numero2);

        System.out.println("JAVA NO UTILIZA PUNTEROS QUE VAYAN A DIRECCIONES DE MEMORIA PARA VARIABLES\n" +
                "GUARDA VALORES EN SU LUGAR, POR ESO NUMERO 2 NO CAMBIA DE VALOR");
    }
}
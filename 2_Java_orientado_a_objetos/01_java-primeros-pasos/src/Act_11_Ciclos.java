public class Act_11_Ciclos {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        System.out.println("ciclo while");
        while (contador <= 10){
            total += contador;
            System.out.println(contador);
            contador++;
        }
        System.out.println("total: "+total);

        System.out.println("ciclo for");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
//        No se tiene alcance de la variable 'i'
//        System.out.println(i);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
                System.out.println();
        }


    }
}
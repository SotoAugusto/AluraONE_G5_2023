public class testReferencias {
    public static void main(String[] args) {
        Cuenta primerCuenta = new Cuenta();
        Cuenta segundaCuenta = primerCuenta;
//        Cuenta segundaCuenta = new Cuenta();


        System.out.println("ID del objeto primerCuenta:"+ primerCuenta);
        System.out.println("ID del objeto segundaCuenta:"+ segundaCuenta);
        if (primerCuenta == segundaCuenta) {
            System.out.println("Ambos tienen el mismo id porque" +
                    "apuntan al mismo objeto");
        }else {
            System.out.println("Son diferentes");
        }
    }
}
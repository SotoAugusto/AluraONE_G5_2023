public class CrearCuentaObject {
    public static void main(String[] args) {
    // Tipo variable, nombre variable - new nombre clase que hereda
       Cuenta primeraCuenta = new Cuenta();
//       primeraCuenta.saldo = 100;
        primeraCuenta.depositar(100);
        Cuenta segundaCuenta = new Cuenta();

//        segundaCuenta.saldo = 10;
        segundaCuenta.depositar(10);
        System.out.println(segundaCuenta.getSaldo());
        System.out.println(primeraCuenta.getSaldo());
        primeraCuenta.depositar(1000);
        System.out.println(primeraCuenta.getSaldo());
        System.out.println(primeraCuenta.retirar(100));


        System.out.println("transferencia:");
        System.out.println(primeraCuenta.transferir(100, segundaCuenta));
        System.out.println(primeraCuenta.getSaldo());
        System.out.println(segundaCuenta.getSaldo());
    }
}
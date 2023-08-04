public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setSaldo(400);
        cuenta.retirar(300);
        cuenta.setNumero(100);
        System.out.println(cuenta.getSaldo());
    }
}
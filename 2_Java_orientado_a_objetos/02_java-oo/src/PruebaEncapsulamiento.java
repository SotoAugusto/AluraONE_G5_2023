public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuentaObject = new Cuenta();
        Cliente clienteObject = new Cliente();
        clienteObject.setNombre("Diego");
        clienteObject.setDocumento("asdaasdf34");

        cuentaObject.setTitular(clienteObject);
//ahora el titular del objeto cuentaObject es el objeto clienteObject
        System.out.println(clienteObject.getNombre());
        System.out.println(cuentaObject.getTitular().getNombre());

        System.out.println(clienteObject);
        System.out.println(cuentaObject.getTitular());

        // crea un objeto de tipo cliente, que almacena el titular de la cuenta
        Cliente titular = cuentaObject.getTitular();

        System.out.println(titular);


    }
}
public class ClienteTestObject {
    public static void main(String[] args) {
        // Tipo variable , nombre variable - new nombre clase que hereda
        Cliente ClienteAmir = new Cliente();

//        amir.nombre = "Amir"; old way before private
//        crea un nuevo cliente
        ClienteAmir.setNombre("AmirSoto");


//        crea una nueva cuenta
        Cuenta cuentaDeAmir = new Cuenta();
        cuentaDeAmir.setAgencia(1);

        //en Cuenta tengo una variable llamada titular tipo Cliente
        //el OBJETO "amir" es de tipo Cliente y es declarado en esta clase
        //así se referencian

        //referencia
        //                      objeto ClienteAmir
        cuentaDeAmir.setTitular(ClienteAmir); ;

        System.out.println(cuentaDeAmir.getTitular());
        System.out.println(ClienteAmir);
//        System.out.println(cuentaDeAmir.titular.nombre); old way

//        obtener el titular de la clase Cuenta
//        y el nombre de la clase Cliente
        System.out.println(cuentaDeAmir.getTitular().getNombre());

//        obtengo el titular del objeto cuentaDeAmir
//        y obtengo el nombre del titular del objeto ClienteAmir

        //-------------------------------------------
        //también

        Cuenta cuentaDeMarcela = new Cuenta();

//        cuentaDeMarcela.titular = new Cliente(); old way before private
        cuentaDeMarcela.setTitular(new Cliente());
//        cuentaDeMarcela.titular.nombre = "Marcela"; old way


//        como hacer????
//        cuentaDeMarcela.;

        System.out.println(cuentaDeMarcela.getTitular().getNombre());



    }
}
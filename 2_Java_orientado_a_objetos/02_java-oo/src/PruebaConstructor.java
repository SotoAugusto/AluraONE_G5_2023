public class PruebaConstructor {
    public static void main(String[] args) {
//        el constructor te obliga a otorgar parametros para inicializar un objeto
        Cuenta cuentaObjetoNuevo = new Cuenta(555);
        Cuenta cuentaObjetoNuevo2 = new Cuenta(5552);


        System.out.println(cuentaObjetoNuevo.getAgencia());

        System.out.println("El total de cuentas creadas es de : "+Cuenta.getTotalCuentas());


    }
}
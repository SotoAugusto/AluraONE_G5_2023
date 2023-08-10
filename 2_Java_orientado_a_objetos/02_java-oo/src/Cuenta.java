public class Cuenta{
    private double saldo;
    private int agencia;
    private int numero;
//    private Cliente titular;
    //static no la puede manipular la instancia, es unícamente manipulable por clase y no se puede heredar
    private static int totalCuentas;

//    Cada vez que se crea un objeto de la clase Cuenta,
//    también se crea un objeto de la clase Cliente que se asocia como el titular de esa cuenta
private Cliente titular = new Cliente();

//constructor por defecto
public Cuenta(){
    System.out.println("Aquí inicia el constructor");
}

//constructor personalizado
    public Cuenta(int agencia){
        System.out.println("Aquí inicia el constructor");
    if (agencia <= 0){
        System.out.println("no se permite agencia como <= 0");
        this.agencia=1;
    }else{
        this.agencia = agencia;
    }
    totalCuentas++;
        System.out.println("Se van creando un total de "+ totalCuentas + " cuentas.");
    }
//Este constructor inicia las cuentas nuevas con un saldo de 100
    public Cuenta (int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100; // esto significa que cada cuenta comienza con un saldo de 100.
        System.out.println("Estoy creando una cuenta");
    }

    //test llamar a un constructor dentro de otro
    public Cuenta (int numero, double saldo){
        //este constructor manda a llamar a otro constructor
        //sirve para no repetir código de validación
    this(113);
    this.numero=numero;
    this.saldo=saldo;
    }
    public static int getTotalCuentas(){
    return Cuenta.totalCuentas;
    }
    public double getSaldo() {
        return saldo;
    }
// no need, there is depositar alredy
//    public void setSaldo(double saldo) {
//        if (saldo > 0){
//            this.saldo = saldo;
//        }
//        else {
//            System.out.println("no se permiten valores debajo de 0");
//        }
//    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0){
            this.agencia = agencia;
        }
        else {
            System.out.println("no se permiten valores debajo de 0");
        }

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0){
            this.numero = numero;
        }
        else {
            System.out.println("no se permiten valores debajo de 0");
        }

    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("deposito exitoso de: "+ valor +" el nuevo saldo es: "+ this.saldo);
    }

    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            if (valor > 0){
                System.out.println("retiro exitoso de: "+ valor +" el nuevo saldo es: "+ this.saldo);
                return true;
            }
        }

        return false;
    }

    //                              Tipo variable - variable
    public boolean transferir (double valor, Cuenta cuenta){
    if (this.saldo >= valor){
        this.saldo -= valor;
        cuenta.depositar(valor);
        System.out.println("transferencia exitosa");
        return true;
    }
    return false;
    }
}
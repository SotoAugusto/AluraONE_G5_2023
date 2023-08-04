public class Cuenta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0){
            this.saldo = saldo;
        }
        else {
            System.out.println("no se permiten valores debajo de 0");
        }
    }

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
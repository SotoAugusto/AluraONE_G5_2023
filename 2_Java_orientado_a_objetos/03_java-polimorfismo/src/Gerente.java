public class Gerente extends  Funcionario{

    private String clave;


    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getClave() {
        return clave;
    }


    public boolean iniciarSesion(String clave)
    {
        return clave.equals("admin123");
    }

    public double getBonificacion()
    {
        return super.getSalario();
    }
}
public class TestGerente {
    public static void main(String[] args) {
        Gerente NuevoGerente = new Gerente();
        NuevoGerente.setNombre("NuevoGerente");
        NuevoGerente.setDocumento("24356346");
        NuevoGerente.setSalario(99999);
        System.out.println(NuevoGerente.getNombre());
        System.out.println(NuevoGerente.getDocumento());
        System.out.println("salario " +NuevoGerente.getSalario());

        System.out.println("bonificación es el mismo salario " + NuevoGerente.getBonificacion());

        System.out.println(NuevoGerente.iniciarSesion("admin123"));
    }










}
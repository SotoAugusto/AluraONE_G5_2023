public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario NuevoFuncionario = new Funcionario();
        NuevoFuncionario.setNombre("NuevoFuncionario");
        NuevoFuncionario.setDocumento("123123kjh");
        NuevoFuncionario.setSalario(12245);
        System.out.println(NuevoFuncionario.getNombre());
        System.out.println(NuevoFuncionario.getDocumento());
        System.out.println("salario " +NuevoFuncionario.getSalario());

        System.out.println("bonificación " + NuevoFuncionario.getBonificacion());


    }
}
package questao_11;

public class TesteEmpresa {
	public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-90");

        Funcionario funcionario1 = new Funcionario("Alice", "12345678901", 3000.00);
        Funcionario funcionario2 = new Funcionario("Bruno", "10987654321", 4000.00);

        empresa.contratarFuncionario(funcionario1);
        empresa.contratarFuncionario(funcionario2);

        System.out.println(empresa);

        empresa.demitirFuncionario("12345678901"); 
        System.out.println(empresa);
        
        empresa.demitirFuncionario("00000000000");
    }
}

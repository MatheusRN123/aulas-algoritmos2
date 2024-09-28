package questao_13;

public class TesteLoja {
	public static void main(String[] args) {
        Loja loja = new Loja("Minha Loja");

        Funcionario f1 = new Funcionario("Alice", "12345678901");
        Funcionario f2 = new Funcionario("Bruno", "10987654321");

        loja.adicionarFuncionario(f1);
        loja.adicionarFuncionario(f2);

        
        loja.registrarEntrada("12345678901");
        loja.registrarSaida("12345678901");
        
        loja.registrarEntrada("10987654321");
        loja.registrarSaida("10987654321");


        loja.imprimirRegistros("12345678901");
        loja.imprimirRegistros("10987654321");
    }
}

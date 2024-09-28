package questao_3;

public class TesteCalculadora {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		double soma = calc.somar(4,2.2);
		System.out.println("A soma é: "+soma);
		
		double sub = calc.subtrair(6,10.4);
		System.out.println("A subtração é: "+sub);
		
		double mult = calc.multiplicar(9,9.5);
		System.out.println("A multiplicação é: "+mult);
		
		try {
			double div = calc.dividir(10,2.5);
			System.out.println("A divisão é: "+div);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

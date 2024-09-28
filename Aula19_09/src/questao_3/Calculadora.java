package questao_3;

public class Calculadora {
	double n1 = 0, n2 = 0, soma, sub, div, mult;
	
	void setN1(Double n1) {
		this.n1 = n1;
	}
	
	void setN2(Double n2) {
		this.n2 = n2;
	}
	
	double getN1() {
		return n1;
	}
	
	double getN2() {
		return n2;
	}
	
	double somar(double n1, double n2) {
		return n1+n2;
	}
	
	double subtrair(double n1, double n2) {
		return n1-n2;
	}
	
	double multiplicar(double n1, double n2) {
		return n1*n2;
	}
	
	double dividir(double n1, double n2) {
		if(n2 == 0) {
			throw new IllegalArgumentException("Não é possível dividir por zero.");
		}else {
			return n1/n2;
		}
	}
}

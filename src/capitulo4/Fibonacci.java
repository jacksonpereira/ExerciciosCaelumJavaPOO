package capitulo4;

public class Fibonacci {
	
//	Methods
	public int calculaFibonacci(int valor) {
		if(valor!=1) {
			return valor*(calculaFibonacci(valor-1));
		}else {
			return 1;
		}
	}
}

package capitulo4;

import java.util.ArrayList;

public class Fibonacci {
	
//	Properties
	public int resultado;
	
//	Getters and setters
	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
//	Methods
	public int calculaFibonacci(int valor) {
		ArrayList<Integer> f = new ArrayList<Integer>();
		f.add(0);
		f.add(1);
		for(int i=1; i<=valor; i++) {
			f.add(f.get(i)+f.get(i-1));
		}
		this.setResultado(f.get(-1));
		return this.getResultado();
	}
}

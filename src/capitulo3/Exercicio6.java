package capitulo3;

import java.util.ArrayList;

public class Exercicio6 {
	
	public static void main(String[] args) {
		ArrayList<Integer> f = new ArrayList<Integer>();
		int a = 2;
		f.add(0);
		f.add(1);
		while(f.get(a-1)<=100) {
			f.add(f.get(a-1)+f.get(a-2));
			a++;
		}
		System.out.println("Resultado: "+f);
	}

}

package capitulo3;

import java.util.ArrayList;

public class Desafio {

	public static void main(String[] args) {
		ArrayList<Integer> f = new ArrayList<Integer>();
		f.add(0);
		f.add(1);
		int a = 2;
		while((f.get(a-1)+f.get(a-2))<=100) {
			f.add((f.get(a-1)+f.get(a-2)));
			System.out.println(f.get(a));
			a++;
		}
	}

}

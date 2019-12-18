package capitulo3;

public class Casting {

	public static void main(String[] args) {
		int a = 0;
		while(a <= 3) {
			System.out.println("Pivô: "+ a);
			for(int i = 0; i<=4; i++) {
				System.out.println(a+i);
			}
			++a;
		}
	}
}

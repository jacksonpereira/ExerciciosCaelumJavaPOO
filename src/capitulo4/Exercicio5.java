package capitulo4;

public class Exercicio5 {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		
		c1.setNomeTitular("Danilo");
		c1.setSaldo(100);
		
		Conta c2 = c1;
		
		if(c1==c2) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
	}

}

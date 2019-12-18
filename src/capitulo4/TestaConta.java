package capitulo4;

public class TestaConta {

	public static void main(String[] args) {

		Conta c1 = new Conta();

		c1.setNomeTitular("Hugo");
		c1.setNumero(123);
		c1.setAgencia("45678-9");
		c1.setSaldo(50.0);
		Data data = new Data();
		c1.setDataAbertura(data);

		c1.deposita(100.00); System.out.println("Saldo atual: "+c1.getSaldo());
		System.out.println("Rendimento mensal: "+c1.calcularRendimento());
		System.out.println(c1.recuperarDadosParaImpressao());
	 
	}

}
